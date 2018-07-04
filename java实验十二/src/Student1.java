import java.io.*;

/**
 * JavaIO流实验
 *
 * @author Lian
 * @create 2018-06-14 下午6:27
 **/
public class Student1 {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("students.dat"));
        out.writeUTF("王海");
        out.writeInt(20);
        out.writeUTF("计算机");
        System.out.println();
        System.out.println("已把学生的信息写入student.dat");

        DataInputStream in = new DataInputStream(new FileInputStream("students.dat"));
        BufferedReader buff = new BufferedReader(new InputStreamReader(in));
        System.out.println("从students.dat中读取出来的学生信息");
        System.out.print(in.readUTF()+"\t");
        System.out.print(in.readInt()+"\t");
        System.out.print(in.readUTF()+"\t");

        buff.close();
        out.close();
        in.close();

    }
}

