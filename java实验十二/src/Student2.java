import java.io.*;
import java.util.Scanner;

/**
 * @author Lian
 * @create 2018-06-14 下午7:50
 **/
public class Student2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner scan = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = scan.next();
        System.out.print("请输入年龄：");
        int age = scan.nextInt();
        System.out.print("请输入系别：");
        String  dept = scan.next();
        scan.close();

        Student student = new Student(name,age,dept);

        FileOutputStream fileOut = new FileOutputStream("students.dat");
        BufferedOutputStream buffOut = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(buffOut);
        System.out.println("已把学生的信息写入student.dat\n");
        out.writeObject(student);
        out.close();
        buffOut.close();
        fileOut.close();


        FileInputStream fileIn=new FileInputStream("students.dat");
        BufferedInputStream buffIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(buffIn);
        Student studentTo = (Student) in.readObject();
        in.close();
        buffIn.close();
        fileIn.close();

        System.out.println("从students.dat中读取出来的学生信息");
        System.out.println(studentTo.toString());
    }
}
