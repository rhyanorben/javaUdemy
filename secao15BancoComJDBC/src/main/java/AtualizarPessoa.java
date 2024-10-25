import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AtualizarPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Você deseja fazer alteração buscando no ID (1) ou Nome (2) ?");
        String respostaComando = scanner.nextLine();

        String sql = "";
        PreparedStatement stmt = null;

        if (respostaComando.equals("1")) {
            System.out.println("Qual o ID do cliente?");
            Integer idCliente = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual o novo ID do cliente?");
            Integer idNovoCliente = scanner.nextInt();

            sql = "UPDATE pessoas SET codigo = ? WHERE codigo = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idNovoCliente);
            stmt.setInt(2, idCliente);

        } else if (respostaComando.equals("2")) {

            System.out.println("Qual o nome do cliente?");
            String nomeCliente = scanner.nextLine();
            System.out.println("Qual o novo nome do cliente?");
            String nomeNovoCliente = scanner.nextLine();

            sql = "UPDATE pessoas SET nome = ? WHERE nome = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nomeNovoCliente);
            stmt.setString(2, nomeCliente);

        } else {
            System.out.println("Opção inválida!");
        }

        if (stmt != null) {
            int rowsAffected = stmt.executeUpdate();
            System.out.println("Atualizado com sucesso. Linhas atualizadas: " + rowsAffected);
        }

        scanner.close();
        conexao.close();
    }

}
