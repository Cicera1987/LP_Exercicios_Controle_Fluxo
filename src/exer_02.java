import java.util.Scanner;

/*
* 2. Escreva um programa em Java que recebe um número
inteiro positivo e imprime se ele é um número primo ou
não. Utilize um loop for para testar se o número é primo.
* */
// Número primo - divisível por ele mesmo apenas.

public class exer_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int number;
        int ehPrimo = 0;
        System.out.println("Digite um numero inteiro e positivo!");
        number = ler.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                ehPrimo++;
            }

            if ( ehPrimo == 2){
                System.out.println(" o número , " + number + ", é um numero primo");
            }else{
                System.out.println(" o número , " + number + ", não é um numero primo");
        }

        }
    }
}