import java.util.Date;

public class Livro {

    String isbn;
    int numPagina;
    String titulo;

    void emprestar(Aluno a){
        System.out.println("Emprestado" + a.name);
    }
    int emprestar(int dias){
        return dias;
    }
    Date emprestar(Date data){System.out.println("Emprestado na data" + data);
        return data;
    }

    int somar (int a, int b){
        int x = a+b;
        return x;
    }
    void imprimirSoma(int x, int y){
        int z = x + y;
        System.out.println("A Soma é " + z);
    }


}
