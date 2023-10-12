package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> catalogo;
    private List<Usuario> usuarios;
    
    public Biblioteca() {
        catalogo = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    
    public void adicionar_livro(Livro livro) {
        catalogo.add(livro);
    }
    
    public void adicionar_usuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public void emprestar_livro(String isbn, int matriculaUsuario) {
        // Implemente a lógica para emprestar um livro com base no ISBN e na matrícula do usuário
        // Você pode usar a lista de 'catalogo' e 'usuarios' para encontrar os objetos correspondentes.
    }
    
    public List<Livro> listar_livros_emprestados() {
        List<Livro> livrosEmprestados = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.estaEmprestado()) {
                livrosEmprestados.add(livro);
            }
        }
        return livrosEmprestados;
    }
    
    // Outros métodos da biblioteca
}
