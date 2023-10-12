package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class GeradorUsuarios {

    public static List<Usuario> gerarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        for (int i = 1; i <= 25; i++) {
            String nome = "Usuário " + i;
            String cpf = "CPF" + i;
            int matricula = 1000 + i; // Matrícula fictícia para exemplo
            Usuario usuario = new Usuario(nome, cpf, matricula);
            usuarios.add(usuario);
        }
        return usuarios;
    }

    public static void main(String[] args) {
        List<Usuario> usuarios = gerarUsuarios();
        for (Usuario usuario : usuarios) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("CPF: " + usuario.getCpf());
            System.out.println("Matrícula: " + usuario.getMatricula());
            System.out.println();
        }
    }
}

