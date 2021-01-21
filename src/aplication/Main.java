package aplication;

import aplication.tabuleiro.Borda;
import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.XadrezException;
import xadrez.XadrezPosicao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PartidaXadrez partidaXadrez = new PartidaXadrez();

        while (true) {
            try {
                UI.limparTela();
                UI.printBorda(partidaXadrez.getPecas());
                System.out.println();
                System.out.print("Origem: ");
                XadrezPosicao origem = UI.lerXadrezPosicao(scan);

                System.out.println();
                System.out.print("Destinho: ");
                XadrezPosicao destino = UI.lerXadrezPosicao(scan);

                boolean[][] movimentosPossiveis = partidaXadrez.movimentosPossiveis(origem);
                UI.limparTela();
                UI.printBorda(partidaXadrez.getPecas(), movimentosPossiveis);

                PecaXadrez pecaCapturada = partidaXadrez.moverPeca(origem, destino);
            } catch (XadrezException e) {
                System.out.println(e.getMessage());
                scan.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scan.nextLine();
            }
        }
    }
}
