import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Lian
 * @create 2018-06-14 下午8:21
 **/
public class Student3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Student> students = new ArrayList<Student>();

        Scanner scan = new Scanner(System.in);

        FileOutputStream fileOut = new FileOutputStream("students.dat");
        BufferedOutputStream buffOut = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(buffOut);

        int i = 1;
        while (true) {
            System.out.println("第" + i + "名学生：");
            i++;
            System.out.print("请输入姓名：");
            String name = scan.next();
            if (name.equals("#")) {
                break;
            }

            System.out.print("请输入年龄：");
            int age = scan.nextInt();
            System.out.print("请输入系别：");
            String dept = scan.next();

            Student student = new Student(name, age, dept);

            students.add(student);
        }
        scan.close();
        out.writeObject(students);
        out.close();
        buffOut.close();
        fileOut.close();
        System.out.println("已把学生的信息写入student.dat\n");

        FileInputStream fileIn = new FileInputStream("students.dat");
        BufferedInputStream buffIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(buffIn);
        System.out.println("从students.dat中读取出来的学生信息");

        List<Student> student1 = (List<Student>) in.readObject();
        for (Student s : student1) {
            System.out.println(s.toString());
        }

        in.close();
        buffIn.close();
        fileIn.close();
    }
}
