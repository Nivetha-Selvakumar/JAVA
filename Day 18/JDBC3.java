import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class JDBC3 {
    public static void main(String[] args) throws Exception{
        String url= "jdbc:mysql://localhost:3306/a";
        String uname= "root";
        String pword= "niveabi23";
        Class.forName("com.mysql.cj.jdbc.Driver");
        String Q= "insert into t values('Gopi',20) ";
        String f="select name from t where age=21";
        Connection connection= DriverManager.getConnection(url,uname,pword);
        PreparedStatement p= connection.prepareStatement(Q);
        p.execute();
        Statement st=connection.createStatement();
        ResultSet rs = st.executeQuery(f);
        rs.next();
        String name = rs.getString("name");
        System.out.print(name);
        st.close();
        rs.close();

    }
}