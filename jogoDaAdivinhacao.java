package nada;
import java.util.Scanner;

public class jogoDaAdivinhacao {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numeroSecreto = (int) (Math.random() * 100);;// gera um numero aletaroio 0 ate 99
            int tentive = 0;
            int papites;

            System.out.println("Seja Bem-Vindo ao Jogo de adivinhação");
            System.out.println("Tente adivinha o número secreto de (0 ate 99)");

            do {
                System.out.println("Digite o palpite");
                papites = sc.nextInt();
                tentive++;

                if(papites < numeroSecreto) {
                    System.out.println("O número secreto é menor que seu palpite!!");
                } else if (papites > numeroSecreto) {
                    System.out.println(" O seu Palpite é maior que o número secreto!!");
                } else {
                    System.out.println("Parabens! Você acertou o número secreto em " + tentive);
                }

            } while (papites != numeroSecreto);
            sc.close();
        }
    }
}
