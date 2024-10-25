import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {

        //Cria a conexão com banco de dados
        Connection conexao = FabricaConexao.getConexao();

        Scanner scanner = new Scanner(System.in);

        //Query de execução no DB
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        //Statement que realiza a consulta da String criada
        PreparedStatement stmt = conexao.prepareStatement(sql);
        System.out.println("Quais caracteres deve conter no nome? ");
        stmt.setString(1, "%" + scanner.next() + "%");
        ResultSet consulta = stmt.executeQuery();

        //Lista de pessoas para armazenar os dados
        List<Pessoa> pessoas = new ArrayList<>();

        //Consulta e retorna cada uma das pessoas encontradas na tabela do BD e adiciona na lista
        while (consulta.next()) {
            pessoas.add(new Pessoa(
                    consulta.getInt("codigo"),
                    consulta.getString("nome")
            ));
        }

        //Foreach para imprimir no console as pessoas adicionadas a lista
        for (Pessoa p : pessoas) {
            System.out.println(
                    p.getCodigo() + " | " + p.getNome()
            );
        }

        scanner.close();
        stmt.close();
        conexao.close();
    }

}
