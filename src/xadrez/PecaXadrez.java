package xadrez;

import aplication.tabuleiro.Borda;
import aplication.tabuleiro.Peca;

public abstract class PecaXadrez extends Peca {
    private Cor cor;

    public PecaXadrez(Borda borda, Cor cor) {
        super(borda);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

}
