import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SqlUtil {
    private static Properties properties;
    static {
        try {
            InputStream in = Sql.class.getClassLoader().getResourceAsStream("database.properties");//相对路径
            properties = new Properties();
            properties.load(in);

//            properties = new Properties();
//            properties.load(new FileInputStream("/home/lian/IdeaProjects/Web/src/database.properties"));//绝对路径
        } catch (FileNotFoundException e1) {
            System.out.println("加载文件失败");
            e1.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getDriVerClassProperties() {
        return properties.getProperty("driverClass");
    }

    public static String getUrlProperties() {
        return properties.getProperty("url");
    }

    public static String getUserProperties() {
        return properties.getProperty("user");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }
}