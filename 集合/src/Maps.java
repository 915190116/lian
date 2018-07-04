import java.util.*;

public class Maps {
    public static void main(String[] args) {
        //键值对,二次取值
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "Hello");
        map.put("2", "asd");
        for (String str :
                map.keySet()) {
            System.out.println("键(" + str + ")->值(" + map.get(str) + ")");
        }

        //只取值,不取键
        for (String v :
                map.values()) {
            System.out.println(v);
        }

        //通过Map.entrySet使用iterator遍历key和value：
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("键(" + entry.getKey() + ")->值(" + entry.getValue() + ")");
        }

        //容量大时,通过Map.entrySet遍历key和value
        for (Map.Entry<String, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
