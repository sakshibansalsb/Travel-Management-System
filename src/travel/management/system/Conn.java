package travel.management.system;
import java.sql.*;
public class Conn {
  Connection c;
  Statement s;
  Conn() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      c = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/TravelManagementSystem", "root",
          "123456");
      s = c.createStatement();
      System.out.print("Abcd");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
