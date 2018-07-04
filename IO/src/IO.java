import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/lian/桌面/11",true);//加true可以续写
        fw.write("什么人\n");
        fw.flush();
        fw.write("谁");
        fw.close();
    }
}
