import java.util.Scanner;

/*
4. Escreva um programa em Java que solicita um número
inteiro positivo e imprime todos os números pares entre 1
e esse número. Utilize um loop while para realizar a
impressão.
* */
public class exer_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int number, i = 1;
        System.out.println("Digite um numero inteiro e positivo!");
        number = ler.nextInt();

        System.out.println("Numeros pares entre 1 e "+ number +":");
        while (i <= number){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}

