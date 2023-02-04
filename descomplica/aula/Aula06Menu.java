package descomplica.aula;

import java.util.Scanner;

public class Aula06Menu {
    public static void main(String[] args) {
        int op;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("-----------------");
            System.out.println("Menu principal");
            System.out.println("-----------------");
            System.out.println("Selecione uma das opcoes abaixo:");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Outro");
            System.out.println("0 - Sair");

            System.out.println("Qual opcao deseja?");
            op = input.nextInt();

            if (op == 0) {
                break;
            }

            switch (op) {
                case 1:
                    System.out.println("Voce escolheu a oopcao do alulo");
                    break;
                case 2:
                    System.out.println("Voce escolheu a oopcao do Professor");
                    break;
                case 3:
                    System.out.println("Voce escolheu a oopcao do Outro");
                    break;
                default:
                    System.out.println("Voce escolheu a oopcao invalida");
                    break;
            }
            
        } while (true);
        System.out.println("FIM");
    }
}
