import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;

/**
 * 文件类和随机访问类实验
 *
 * @author Lian
 * @create 2018-06-22 下午3:49
 **/
public class HowManyTimes {
    public static void main(String[] args) throws IOException {
        File file = new File("howmanytimes.dat");
        if (!file.exists()) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.writeInt(1);
            System.out.println("第1次运行");
            randomAccessFile.close();
        } else {
            RandomAccessFile randomAccessFile = new RandomAccessFile("howmanytimes.dat", "rw");
            int k = randomAccessFile.readInt() + 1;
            randomAccessFile.seek(0);
            System.out.println("第" + k + "次运行");
            System.out.println("上次运行时间是："+new SimpleDateFormat("yyyy年MM月ss日hh时mm分ss秒").format(file.lastModified()));
            randomAccessFile.writeInt(k);
            randomAccessFile.close();
        }
    }
}
