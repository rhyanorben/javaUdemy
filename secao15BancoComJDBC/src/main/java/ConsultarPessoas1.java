import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

    public static void main(String[] args) throws SQLException {

        //Cria a conexão com banco de dados
        Connection conexao = FabricaConexao.getConexao();

        //Query de execução no DB
        String sql = "SELECT * FROM pessoas";

        //Statement que realiza a consulta da String criada
        Statement stmt = conexao.createStatement();
        ResultSet consulta = stmt.executeQuery(sql);

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

        stmt.close();
        conexao.close();
    }

}
