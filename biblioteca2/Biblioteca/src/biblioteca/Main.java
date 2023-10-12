package biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Livro 1", "Autor 1", "ISBN1");
        Livro livro2 = new Livro("Livro 2", "Autor 2", "ISBN2");
        Livro livro3 = new Livro("Outro Livro", "Autor 1", "ISBN3");

        biblioteca.adicionar_livro(livro1);
        biblioteca.adicionar_livro(livro2);
        biblioteca.adicionar_livro(livro3);

        Usuario usuario1 = new Usuario("João", "123.456.789-01", 1001);
        Usuario usuario2 = new Usuario("Maria", "987.654.321-10", 1002);

        biblioteca.adicionar_usuario(usuario1);
        biblioteca.adicionar_usuario(usuario2);

        biblioteca.emprestar_livro("ISBN1", 1001);
        biblioteca.emprestar_livro("ISBN2", 1002);

        System.out.println("Livros emprestados:");
        for (Livro livro : biblioteca.listar_livros_emprestados()) {
            System.out.println(livro.exibir_info());
        }
    }
}
