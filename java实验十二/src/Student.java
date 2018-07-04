import java.io.Serializable;

/**
 * 学生类
 *
 * @author Lian
 * @create 2018-06-14 下午7:45
 **/
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;
    String dept;

    public Student(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return  name + '\t' + age + "\t" + dept + '\t';
    }
}
