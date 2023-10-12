package biblioteca;

import java.util.Random;

public class Acervo {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Random random = new Random();

        // Adicionar 50 livros ao acervo
        for (int i = 1; i <= 50; i++) {
            String titulo = "Livro " + i;
            String autor = "Autor " + i;
            String isbn = "ISBN" + i;
            Livro livro = new Livro(titulo, autor, isbn);
            biblioteca.adicionar_livro(livro);
        }

        // Adicionar 25 usuários
        for (int i = 1; i <= 25; i++) {
            String nome = "Usuário " + i;
            String cpf = "CPF" + i;
            int matricula = 1000 + i; // Exemplo de geração de matrícula
            Usuario usuario = new Usuario(nome, cpf, matricula);
            biblioteca.adicionar_usuario(usuario);
        }

        // Empréstimos de livros aleatórios (exemplo)
        for (int i = 1; i <= 10; i++) {
            int livroIndex = random.nextInt(50);
            int usuarioIndex = random.nextInt(25);
            String isbn = "ISBN" + (livroIndex + 1);
            int matricula = 1000 + (usuarioIndex + 1);
            biblioteca.emprestar_livro(isbn, matricula);
        }

        // Listar livros emprestados (exemplo)
        System.out.println("Livros emprestados:");
        for (Livro livro : biblioteca.listar_livros_emprestados()) {
            System.out.println(livro.exibir_info());
        }
    }
}
