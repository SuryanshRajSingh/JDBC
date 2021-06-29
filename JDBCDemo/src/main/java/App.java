import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cgi","root","root");
        System.out.println("connection"+connection);
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT * FROM Consumer");
        while (resultSet.next()){
            Integer consumerID = resultSet.getInt("Consumer_ID");
            String consumer_name = resultSet.getNString("Consumer_Name");
            String city = resultSet.getNString("City");
            System.out.println("ConsumerID is "+consumerID+"Name is "+consumer_name+"City is "+ city);
        }
    }
}
