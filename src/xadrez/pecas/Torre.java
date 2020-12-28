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
}
