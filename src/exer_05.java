import java.util.Scanner;

/*
5. Escreva um programa em Java que solicita um número
inteiro positivo e imprime todos os números ímpares
entre 1 e esse número. Utilize um loop for para realizar a
impressão.
* */
public class exer_05 {
    public static void main(String[] args) {
        Scanner lerNumero = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero inteiro e positivo!");
        num = lerNumero.nextInt();

        System.out.println("Numeros impares entre 1 e "+ num +":");
        for (int i = 1; i<=num;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
