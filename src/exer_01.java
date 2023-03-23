
/*
1. Faça um programa em Java que solicita um número
inteiro positivo e calcule a soma dos números naturais
até esse número. Utilize um loop while para realizar o
cálculo.
* */

import java.util.Scanner;

public class exer_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int number, soma = 0;

        System.out.println("Digite um numero inteiro e positivo!");
        number = ler.nextInt();

        System.out.println("A soma dos numeros que provem do  "+ number +" é : ");
        while (number < 0)
            soma = number + soma;
                System.out.println(soma);
                soma++;
        }

    }
