/**
*@Author Lian
*@Data
*/
public class TestMyArray {
    public static void main(String[] args) {
        System.out.println("第1个数组:");
        Integer[] c1 = {84, 59, 38, 207, 26, 98, 35, -54, 65, 55};
        MyArray<Integer> a1 = new MyArray<Integer>(c1);
        System.out.println("数组内容：" + a1);
        System.out.println("数组长度：" + a1.len());
        a1.set(2, 100);
        System.out.println("新数组内容：" + a1);
        System.out.println();

        System.out.println("第2个数组");
        Double[] c2 = {75.2, 99.6, 33.5, 66.7, -12.4, 108.1};
        MyArray<Double> a2 = new MyArray<Double>(c2);
        System.out.println("数组内容：" + a2);
        System.out.println("数组长度：" + a2.len());
        a2.set(2, 88.8);
        System.out.println("新数组内容：" + a2);
        System.out.println();

        System.out.println("第3个数组");
        Character[] c3 = {'y', 'o', 'u', 'r', 's', 'e', 'l', 'f'};
        MyArray<Character> a3 = new MyArray<Character>(c3);
        System.out.println("数组内容：" + a3);
        System.out.println("数组长度：" + a3.len());
        a3.set(2, 'z');
        System.out.println("新的数组内容：" + a3);
    }
}
