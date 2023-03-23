
import java.util.Scanner;
/*
3. Escreva um programa em Java que solicita um número
inteiro positivo e imprime a tabuada desse número até o
número 10. Utilize um loop for para realizar a impressão.
* */

public class exer_03 {
    public static void main(String[] args) {

        Scanner tabuada = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero inteiro e positivo!");
        num = tabuada.nextInt();

        System.out.println("A tabuada do número " + num + " é :");
        for (int x = 0; x <= 10; x++){
            System.out.println(num + "x" + x + " = " + (num * x));
        }
    }
}
