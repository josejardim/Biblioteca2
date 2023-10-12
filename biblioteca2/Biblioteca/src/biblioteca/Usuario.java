package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private int matricula;

    public Usuario(String nome, String cpf, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getMatricula() {
        return matricula;
    }

   
    
    public static List<Usuario> gerarUsuariosPadrao() {
        List<Usuario> usuarios = new ArrayList<>();
        for (int i = 1; i <= 25; i++) { // Gere 25 usuários
            String nome = "Usuário " + i;
            String cpf = "CPF" + i;
            int matricula = 1000 + i; // Exemplo de geração de matrícula
            Usuario usuario = new Usuario(nome, cpf, matricula);
            usuarios.add(usuario);
        }
        return usuarios;
    }

}
