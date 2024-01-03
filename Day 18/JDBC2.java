import java.sql.*;

public class JDBC2 {
    public static void main(String[] args) throws Exception{
        String url= "jdbc:mysql://localhost:3306/a";
        String uname= "root";
        String pword= "niveabi23";
        Class.forName("com.mysql.jdbc.Driver");
        String Q= "insert into t values(\"pradii\",21)";
        Connection connection= DriverManager.getConnection(url,uname,pword);
        PreparedStatement p= connection.prepareStatement(Q);
        p.execute();
        }
}