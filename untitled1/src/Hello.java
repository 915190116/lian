import jdk.nashorn.internal.runtime.JSONListAdapter;
import net.sf.json.JSONArray;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static ArrayList<String> xian() {
//        String[] a = new String[]{"22", "33", "44"};
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("年龄");
//        for (int i = 0; i < a.length; i++) {
//            list.add(a[i]);
//        }
//        JSONArray array = new JSONArray();
//        array.add(list);
//        System.out.println(array);
        JK jieK = new JK();
        Connection conn = null;
        Statement stmt = null;
        List<String> list = new ArrayList<String>();
        String[] arr = new String[list.size()];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/closesiot", "root", "123456");
            stmt = conn.createStatement();
            String sql = "select Value  from collectiondata5m union all select Value  from collectiondata5s;";
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                String value = resultSet.getString("Value");
                String b = jieK.ZhuanHuan(value);
                list.add(b);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return (ArrayList<String>) list;
    }

}