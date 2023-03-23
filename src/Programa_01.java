public class Programa_01 {
    public static void main(String[] args) {
        Livro livro_01 = new Livro();
        livro_01.titulo = "Harry Potter";

        Livro livro_02 = new Livro();
        livro_02.titulo = "O Segredo";

        System.out.println("Titulo: " + livro_01.titulo);
        System.out.println("Titulo: " + livro_02.titulo);
        int resposta = livro_02.emprestar(10);
        System.out.println(resposta);

        Aluno aluno_01 = new Aluno();
        aluno_01.name = "Florentina";
        livro_02.emprestar(aluno_01);
    }


}
