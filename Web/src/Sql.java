import java.sql.*;

public class Sql {
    /**
     * 功能:验证数据库中存不存在用户
     */
    public static boolean xian(String id,String pass) {
        SqlUtil sqlUtil = new SqlUtil();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(sqlUtil.getDriVerClassProperties());
            conn = DriverManager.getConnection(sqlUtil.getUrlProperties(), sqlUtil.getUserProperties(), sqlUtil.getPassword());
            stmt = conn.createStatement();
            String sql = "select * from user where id='"+id+"'&&password=md5('"+pass+"');";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();//注意这里

            while (resultSet.next()) {
                resultSet.close();
                stmt.close();
                conn.close();
                return true;
            }
            resultSet.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
//
    }
}
