import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);

        stmt.execute();

        System.out.println("Pessoa incluída com sucesso!");

        scanner.close();

    }

}
