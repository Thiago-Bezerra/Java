package descomplica.aula;

public class Aula06While {
    public static void main(String[] args) {
        int num = 0;

        while(num <= 5){
            System.out.println(num);
            num++;
        }
        // executa pelo menos uma vez o codigo
        do {
            System.out.println(num);
            num++; 
        } while (num <= 5);
    }
}
