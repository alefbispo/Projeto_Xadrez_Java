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

    private void iniciarPartida() {
        borda.colocarPeca(new Torre(borda,Cor.BRANCO), new Posicao(2,1));
        borda.colocarPeca(new Rei(borda,Cor.PRETO), new Posicao(0,3));
        borda.colocarPeca(new Rei(borda,Cor.BRANCO), new Posicao(7,3));
    }
}
