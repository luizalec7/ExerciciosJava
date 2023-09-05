import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10: ");
        int x = entrada.nextInt();
        if (x >= 0 && x <= 10) {
            if(x % 2 == 0){
                System.out.println(x + " é um número par!");
            }
            else{
                System.out.println(x + " é um número ímpar!");
            }
        } else {
            System.out.println("O numero " + x + " não está entre 0 e 10.");
        }

        entrada.close();



    }
}