package xadrez;

import aplication.tabuleiro.Borda;

public class PartidaXadrez {

    private Borda borda;

    public PartidaXadrez() {
        borda = new Borda(8, 8);
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
}
