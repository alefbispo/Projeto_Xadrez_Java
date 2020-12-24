package aplication;

import aplication.tabuleiro.Borda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Borda borda = new Borda(8, 8);

        scan.close();
    }
}
