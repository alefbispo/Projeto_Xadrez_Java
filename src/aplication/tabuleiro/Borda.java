package aplication.tabuleiro;

public class Borda {

    private int linhas;
    private int colunas;
    private Peca[][] pecas;

    public Borda(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            throw new TabuleiroExeption("Erro ao criar tabuleiro: necessario existir pelo menos 1 linha e uma coluna");

        }
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linha, int coluna) {
        if (!posicaoExistente(linha, coluna)) {
            throw new TabuleiroExeption("Posição inexistente no tabuleiro");
        }
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao) {
        if (!posicaoExistente(posicao)) {
            throw new TabuleiroExeption("Posição inexistente no tabuleiro");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void colocarPeca(Peca peca, Posicao posicao) {
        if(temUmaPeca(posicao)){
            throw new TabuleiroExeption("Ja existe uma peça na posição "+ posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    public boolean posicaoExistente(int linha, int coluna) {
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }

    public boolean posicaoExistente(Posicao posicao) {
        return posicaoExistente(posicao.getLinha(), posicao.getColuna());
    }

    public boolean temUmaPeca(Posicao posicao) {
        if (!posicaoExistente(posicao)) {
            throw new TabuleiroExeption("Posição inexistente no tabuleiro");
        }
        return peca(posicao) != null;
    }
}
