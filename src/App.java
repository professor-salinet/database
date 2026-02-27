import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        try {
            Connection conexao = MySQLConnector.conectar();
            String strSqlPopularCbxId = "select * from `senac`.`tbl_senac` order by `id` asc;";
            Statement stmSqlPopularCbxId = conexao.createStatement();
            ResultSet rstSqlPopularCbxId = stmSqlPopularCbxId.executeQuery(strSqlPopularCbxId);
            while (rstSqlPopularCbxId.next()) {
            //     ids.add(rstSqlPopularCbxId.getString("id"));
                System.out.println(rstSqlPopularCbxId.getString("nome"));
            }
            stmSqlPopularCbxId.close();
        } catch (Exception e) {
            // InterfaceView.notificarUsuario("Ops! Ocorreu um problema no servidor e não será possível carregar os ids neste momento. Por favor, retorne novamente mais tarde.", TelaDeAtualizacaoController.lblNotificacoes);
            System.err.println("Erro: " + e);
        }
    }
}
