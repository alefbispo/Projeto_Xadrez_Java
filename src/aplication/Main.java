package aplication;

import aplication.tabuleiro.Borda;
import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.XadrezPosicao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PartidaXadrez partidaXadrez = new PartidaXadrez();

        while (true) {
            UI.printBorda(partidaXadrez.getPecas());
            System.out.println();
            System.out.print("Origem: ");
            XadrezPosicao origem = UI.lerXadrezPosicao(scan);

            System.out.println();
            System.out.print("Destinho: ");
            XadrezPosicao destino = UI.lerXadrezPosicao(scan);

            PecaXadrez pecaCapturada = partidaXadrez.moverPeca(origem, destino);
        }
    }
}
