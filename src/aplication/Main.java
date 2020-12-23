package aplication;

import aplication.tabuleiro.Posicao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Posicao posicao = new Posicao(3, 5);
        System.out.println(posicao);

        scan.close();
    }
}
