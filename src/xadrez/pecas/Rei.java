package xadrez.pecas;

import aplication.tabuleiro.Borda;
import aplication.tabuleiro.Posicao;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {

    public Rei(Borda borda, Cor cor) {
        super(borda, cor);
    }

    @Override
    public String toString() {
        return "R";
    }

    private boolean podeMover(Posicao posicao) {
        PecaXadrez p = (PecaXadrez) getBorda().peca(posicao);
        return p == null || p.getCor() != getCor();
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        boolean[][] mat = new boolean[getBorda().getLinhas()][getBorda().getColunas()];

        Posicao p = new Posicao(0, 0);

        // acima
        p.definirValores(posicao.getLinha() - 1, posicao.getColuna());
        if (getBorda().posicaoExistente(p) && podeMover(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // abaixo
        p.definirValores(posicao.getLinha() + 1, posicao.getColuna());
        if (getBorda().posicaoExistente(p) && podeMover(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // esquerda
        p.definirValores(posicao.getLinha(), posicao.getColuna() - 1);
        if (getBorda().posicaoExistente(p) && podeMover(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // direita
        p.definirValores(posicao.getLinha(), posicao.getColuna() + 1);
        if (getBorda().posicaoExistente(p) && podeMover(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // nw
        p.definirValores(posicao.getLinha() - 1, posicao.getColuna() - 1);
        if (getBorda().posicaoExistente(p) && podeMover(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // ne
        p.definirValores(posicao.getLinha() - 1, posicao.getColuna() + 1);
        if (getBorda().posicaoExistente(p) && podeMover(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // sw
        p.definirValores(posicao.getLinha() + 1, posicao.getColuna() - 1);
        if (getBorda().posicaoExistente(p) && podeMover(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        // ne
        p.definirValores(posicao.getLinha() + 1, posicao.getColuna() + 1);
        if (getBorda().posicaoExistente(p) && podeMover(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
        }
        return mat;
    }
}
