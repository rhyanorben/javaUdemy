public class DAOTeste {

    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluir(sql, "João Ricardo"));
        dao.close();
    }

}
