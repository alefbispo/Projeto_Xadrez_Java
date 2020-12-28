package xadrez.pecas;

import aplication.tabuleiro.Borda;
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
}
