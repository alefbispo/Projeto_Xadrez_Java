package aplication.tabuleiro;

public abstract class Peca {
    protected Posicao posicao;
    private Borda borda;

    public Peca(Borda borda) {
        this.borda = borda;
        posicao = null;
    }

    protected Borda getBorda() {
        return borda;
    }

    public abstract boolean[][] movimentosPossiveis();

    public boolean movimentoPossivel(Posicao posicao) {
        return movimentosPossiveis()[posicao.getLinha()][posicao.getColuna()];
    }

    public boolean ehUmMovimentoPossivel() {
        boolean[][] mat = movimentosPossiveis();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
