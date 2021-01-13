package xadrez.pecas;

import aplication.tabuleiro.Borda;
import aplication.tabuleiro.Posicao;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

    public Torre(Borda borda, Cor cor) {
        super(borda, cor);
    }

    @Override
    public String toString() {
        return "T";
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] mat = new boolean[getBorda().getLinhas()][getBorda().getColunas()];

        // testar acima
        Posicao p = new Posicao(0, 0);
        p.definirValores(posicao.getLinha() - 1, posicao.getColuna());
        while (getBorda().posicaoExistente(p) && !getBorda().temUmaPeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() - 1);
        }
        if (getBorda().posicaoExistente(p) && ehUmaPecaInimiga(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        // testar esquerda
        p.definirValores(posicao.getLinha(), posicao.getColuna() - 1);
        while (getBorda().posicaoExistente(p) && !getBorda().temUmaPeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() - 1);
        }
        if (getBorda().posicaoExistente(p) && ehUmaPecaInimiga(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        // testar direita
        p.definirValores(posicao.getLinha(), posicao.getColuna() + 1);
        while (getBorda().posicaoExistente(p) && !getBorda().temUmaPeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setColuna(p.getColuna() + 1);
        }
        if (getBorda().posicaoExistente(p) && ehUmaPecaInimiga(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }

        // testar abaixo
        p.definirValores(posicao.getLinha() + 1, posicao.getColuna());
        while (getBorda().posicaoExistente(p) && !getBorda().temUmaPeca(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setLinha(p.getLinha() + 1);
        }
        if (getBorda().posicaoExistente(p) && ehUmaPecaInimiga(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        return mat;
    }
}
