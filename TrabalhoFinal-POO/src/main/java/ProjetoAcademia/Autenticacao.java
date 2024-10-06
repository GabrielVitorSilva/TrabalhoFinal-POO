package ProjetoAcademia;

import java.util.HashMap;
import java.util.Map;

public class Autenticacao {
    private Map<String, String> usuarios;

    public Autenticacao() {
        this.usuarios = new HashMap<>();
        // Exemplo de usuário
        usuarios.put("admin", "senha123");
    }

    public boolean autenticar(String usuario, String senha) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(senha);
    }

    public void adicionarUsuario(String usuario, String senha) {
        usuarios.put(usuario, senha);
    }

    public void alterarSenha(String usuario, String novaSenha) {
        if (usuarios.containsKey(usuario)) {
            usuarios.put(usuario, novaSenha);
            System.out.println("Senha alterada com sucesso.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
