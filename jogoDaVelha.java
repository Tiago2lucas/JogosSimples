package nada;

import java.util.Scanner;

public class jogoDaVelha {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
            char player = 'X';
            int row, col;

            while (true) {
                System.out.println(" 0   1   2");
                System.out.println("0 " + board[0][0] + "|" + board[0][1] + "  |" + board[0][2]);
                System.out.println("---+---+---");
                System.out.println("1 " + board[1][0] + "|" + board[1][1] + "  |" + board[1][2]);
                System.out.println("---+---+---");
                System.out.println("2 " + board[2][0] + "|" + board[2][1] + "  |" + board[2][2]);

                System.out.println("Vez do jogador " + player + ".");
                System.out.println("Digite a linha");
                row = sc.nextInt();
                System.out.println("Digite a coluna");
                col = sc.nextInt();

                if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {

                    System.out.println("Jogada inválida.");
                    continue;
                }
                //Atualiza no tabuleiro com o simbolo do jogador "X" OU "0"
                board[row][col] = player;

                if (    board[0][0] == player && board[0][1] == player && board[0][2] == player ||
                        board[1][0] == player && board[1][1] == player && board[1][2] == player ||
                        board[2][0] == player && board[2][1] == player && board[2][2] == player ||
                        board[0][0] == player && board[1][0] == player && board[2][0] == player ||
                        board[0][1] == player && board[1][1] == player && board[2][1] == player ||
                        board[0][2] == player && board[1][2] == player && board[2][2] == player ||
                        board[0][0] == player && board[1][1] == player && board[2][2] == player ||
                        board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                    System.out.println("Jogador " + player + " venceu !");
                    break;
                }

                if (player ==  'X') {
                    player = '0';

                } else {
                    player = 'X';
                }

            }
            sc.close();

        }
    }

}
