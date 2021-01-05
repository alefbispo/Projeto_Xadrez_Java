package xadrez;

import aplication.tabuleiro.Borda;
import aplication.tabuleiro.Posicao;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

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

    private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca) {
        borda.colocarPeca(peca, new XadrezPosicao(coluna, linha).posicionar());
    }

    private void iniciarPartida() {
        colocarNovaPeca('d', 8, new Rei(borda, Cor.BRANCO));
        colocarNovaPeca('d', 7, new Torre(borda, Cor.BRANCO));
        colocarNovaPeca('d', 2, new Torre(borda, Cor.PRETO));
        colocarNovaPeca('d', 1, new Rei(borda, Cor.PRETO));
    }
}
