package descomplica.aula;

import java.util.Scanner;

public class MediaAula04 {
    public static void main(String[] args){

        int nota1;
        int nota2;
        
        try (Scanner digiteNota = new Scanner(System.in)) {
            System.out.println("Digite a nota: ");
            nota1 = digiteNota.nextInt();

            System.out.println("Digite a nota: ");
            nota2 = digiteNota.nextInt();
        }

        float media = (nota1 + nota2)/2;

        System.out.println("Media = " + media);
     
    }
    }