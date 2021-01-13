package xadrez;

import aplication.tabuleiro.Borda;
import aplication.tabuleiro.Peca;
import aplication.tabuleiro.Posicao;

public abstract class PecaXadrez extends Peca {
    private Cor cor;

    public PecaXadrez(Borda borda, Cor cor) {
        super(borda);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    protected boolean ehUmaPecaInimiga(Posicao posicao) {
        PecaXadrez p = (PecaXadrez) getBorda().peca(posicao);
        return p != null && p.getCor() != cor;
    }
}
