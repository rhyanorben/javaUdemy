import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o código: ");
        int codigo = scanner.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);

        if (stmt.executeUpdate() > 0) {
            System.out.println("Pessoas excluida com sucesso!");
        } else {
            System.out.println("Ninguém foi excluído.");
        }

        conexao.close();
        scanner.close();

    }

}
