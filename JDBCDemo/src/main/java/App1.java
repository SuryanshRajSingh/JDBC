import java.sql.*;

    public class App1 {
        public static void main(String[] args) throws SQLException {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cgi","root","root");
            System.out.println("connection"+connection);
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO Consumer values (?,?,?,?,?)");
            stmt.setInt(1,2345);
            stmt.setString(2,"Suryansh");
            stmt.setString(3,"Varanasi");
            stmt.setInt(4,300);
            stmt.setInt(5,1003);
            int i = stmt.executeUpdate();
            System.out.println(i+" records inserted");
            connection.close();
        }
    }
