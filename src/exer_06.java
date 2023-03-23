import java.util.Scanner;

public class exer_06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int number;
        System.out.println("Digite um numero inteiro e positivo!");
        number = teclado.nextInt();

        System.out.println("Numeros pares entre 1 e "+ number +":");
        for(int i=1; i<=number; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

}
