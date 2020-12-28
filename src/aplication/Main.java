package aplication;

import aplication.tabuleiro.Borda;
import xadrez.PartidaXadrez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.printBorda(partidaXadrez.getPecas());

        scan.close();
    }
}
