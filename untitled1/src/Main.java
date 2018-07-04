import net.sf.json.JSONArray;

import java.util.ArrayList;

public class Main {
    private static Hello hello;
    private static ArrayList<String> list;
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        hello = new Hello();
        list = hello.xian();
        jsonArray.add(list);
        System.out.println(jsonArray);
    }
}
