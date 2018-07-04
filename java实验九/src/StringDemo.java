public class StringDemo {
    public static void main(String[] args) {
        String s1 = "I like Java!";
        String s2 = "I hate running and swimming!";

        // 求s1的长度
        System.out.println("s1的长度是" + s1.length());

        char c = s1.charAt(3);  // 把s1的索引值为3的字符赋值给c1
        System.out.println("s1中索引值为3的字符是" + c);

        // 求s1的最后一个字符
        System.out.println("s1的最后一个字符是" + s1.charAt(s1.length() - 1));

        // 把s1变为全小写
        System.out.println(s1.toLowerCase());

        // 把s1变为全大写
        System.out.println(s1.toUpperCase());

        // 输出"I hate Java!"
        System.out.println(s2.substring(0,6)+s1.substring(6,s1.length()));

        // 求字符位置
        int k =s2.indexOf("i");
        System.out.println("s2中第1个字符i的索引值是"+k);
        System.out.println("s2中第2个字符i的索引值是"+s2.indexOf('i',k+1));
        System.out.println("s2中最后1个字符i的索引值是"+s2.lastIndexOf('i'));

        // 求子串位置
        k =s2.indexOf("ing");
        System.out.println("s2中第1个子串ing的索引值是"+k);
        System.out.println("s2中第2个子串ing的索引值是"+s2.indexOf("ing",k+1));
        System.out.println("s2中最后1个子串ing的索引值是"+s2.lastIndexOf("ing"));

    }
}