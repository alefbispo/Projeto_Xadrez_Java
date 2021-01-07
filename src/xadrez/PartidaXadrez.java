package xadrez;

import aplication.tabuleiro.Borda;
import aplication.tabuleiro.Peca;
import aplication.tabuleiro.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

import java.awt.*;

public class PartidaXadrez {

    private Borda borda;

    public PartidaXadrez() {
        borda = new Borda(8, 8);
        iniciarPartida();
    }

    public PecaXadrez[][] getPecas() {
        PecaXadrez[][] mat = new PecaXadrez[borda.getLinhas()][borda.getColunas()];

        for (int i = 0; i < borda.getLinhas(); i++) {
            for (int j = 0; j < borda.getColunas(); j++) {
                mat[i][j] = (PecaXadrez) borda.peca(i, j);
            }
        }
        return mat;
    }

    public PecaXadrez moverPeca(XadrezPosicao posicaoDeOrigem, XadrezPosicao posicaoDestino) {
        Posicao origem = posicaoDeOrigem.posicionar();
        Posicao destino = posicaoDestino.posicionar();
        validarPosicao(origem);
        Peca pecaCapturada = movimentar(origem, destino);
        return (PecaXadrez) pecaCapturada;
    }

    private void validarPosicao(Posicao posicao) {
        if (!borda.posicaoExistente(posicao)) {
            throw new XadrezException("Não existe peça na posição de origem");
        }
    }

    private Peca movimentar(Posicao origem, Posicao destino) {
        Peca p = borda.removerPeca(origem);
        Peca pecaCapturada = borda.removerPeca(destino);
        borda.colocarPeca(p,destino);
        return pecaCapturada;
    }

    private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca) {
        borda.colocarPeca(peca, new XadrezPosicao(coluna, linha).posicionar());
    }

    private void iniciarPartida() {
        colocarNovaPeca('e', 1, new Torre(borda, Cor.BRANCO));
        colocarNovaPeca('c', 1, new Torre(borda, Cor.BRANCO));
        colocarNovaPeca('d', 2, new Torre(borda, Cor.BRANCO));
        colocarNovaPeca('e', 2, new Torre(borda, Cor.BRANCO));
        colocarNovaPeca('c', 2, new Torre(borda, Cor.BRANCO));
        colocarNovaPeca('d', 1, new Rei(borda, Cor.BRANCO));

        colocarNovaPeca('c', 7, new Torre(borda, Cor.PRETO));
        colocarNovaPeca('c', 8, new Torre(borda, Cor.PRETO));
        colocarNovaPeca('d', 7, new Torre(borda, Cor.PRETO));
        colocarNovaPeca('e', 7, new Torre(borda, Cor.PRETO));
        colocarNovaPeca('e', 8, new Torre(borda, Cor.PRETO));
        colocarNovaPeca('d', 8, new Rei(borda, Cor.PRETO));
    }
}
