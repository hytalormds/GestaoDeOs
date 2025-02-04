import br.com.infox.dal.Conexao;
import java.sql.Connection;
import br.com.infox.telas.TelaLogin;

public class Projeto {
    public static void main(String[] args) {
        // Instancia a tela de login
        TelaLogin telaLogin = new TelaLogin();
        
        // Torna a tela visível
        telaLogin.setVisible(true);
    }
}

