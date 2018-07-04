import java.sql.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello,work");
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/books?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "123456");
            stmt = conn.createStatement();
            String sql= "select * from book;";
//            sql= "INSERT INTO test VALUE(3,'li' );";
//            stmt.executeUpdate(sql);
//            sql = "SELECT id,name from test;";

            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
                String name = resultSet.getString("bookid");
                System.out.println("获取的id：" + "的姓名:" + name);
            }


            resultSet.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}