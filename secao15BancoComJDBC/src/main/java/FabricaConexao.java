import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao()  {
        // Configuração para conectar no BD
        try {
            Properties prop = getProperties();
            final String stringDeConexao = prop.getProperty("banco.url");
            final String usuario = prop.getProperty("banco.usuario");
            final String senha = prop.getProperty("banco.senha");

            return DriverManager.getConnection(stringDeConexao, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Externalizado conexão com banco de dados
    private static Properties getProperties() throws IOException {
        final Properties prop = new Properties();
        String caminho = "/conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(caminho));
        return prop;
    }

}
