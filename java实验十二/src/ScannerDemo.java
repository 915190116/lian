import java.io.*;
import java.util.Scanner;

/**
 * @author Lian
 * @create 2018-06-14 下午7:01
 **/
public class ScannerDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("students.dat");
        BufferedOutputStream buffOut = new BufferedOutputStream(fileOut);
        DataOutputStream out = new DataOutputStream(buffOut);
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入姓名：");
        String name = scan.next();
        int i = 0;
        System.out.print("请输入年龄：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
            System.exit(0);
        }
        System.out.print("请输入系别：");
        String ke = scan.next();

        scan.close();

        out.writeUTF(name);
        out.writeInt(i);
        out.writeUTF(ke);

        out.close();
        buffOut.close();
        fileOut.close();

        System.out.println();
        System.out.println("已把学生的信息写入student.dat");

        FileInputStream fileIn = new FileInputStream("students.dat");
        BufferedInputStream buffIn = new BufferedInputStream(fileIn);
        DataInputStream in = new DataInputStream(buffIn);
        System.out.println("从students.dat中读取出来的学生信息");
        System.out.print(in.readUTF() + "\t");
        System.out.print(in.readInt() + "\t");
        System.out.print(in.readUTF() + "\t");

        buffIn.close();
        out.close();
        in.close();
    }
}