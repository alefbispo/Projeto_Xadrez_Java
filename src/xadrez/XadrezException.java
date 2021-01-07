package xadrez;

import aplication.tabuleiro.TabuleiroExeption;

public class XadrezException extends TabuleiroExeption {
    private static final long serialVersionUID = 1L;

    public XadrezException(String msg) {
        super(msg);
    }
}
