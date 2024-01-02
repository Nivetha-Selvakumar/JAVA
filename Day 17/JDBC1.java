import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC1{
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/company";
        String Username = "root";
        String pass = "niveabi23";
        String Query = "select DNAME from department where DNO=1";
        Connection con = DriverManager.getConnection(url, Username, pass);
        Statement st = con.createStatement();
        Class.forName("com.mysql.cj.jdbc.Driver");
        ResultSet rs = st.executeQuery(Query);
        rs.next();
        String name = rs.getString("DNAME");
        System.out.print(name);
        st.close();
        rs.close();
    }
}