import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("123");
        list.add(0, "asd");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println();
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String str :
                strArray) {
            System.out.println(str);
        }

        //迭代器遍历
        System.out.println();
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}