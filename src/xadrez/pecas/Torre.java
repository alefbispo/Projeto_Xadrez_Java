package xadrez.pecas;

import aplication.tabuleiro.Borda;
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
        return mat;
    }
}
