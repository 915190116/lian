public class CheckReverse {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("没有输入字符串");
            System.exit(0);
        }

        //只有一个字符串时
//        int len = args[0].length();
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = len - 1; i >= 0; i--) {
//            stringBuffer.append(args[0].charAt(i));
//        }
//        System.out.println((args[0].contentEquals(stringBuffer) ? "是" : "不是") + "回文");

        //可以用空格
        StringBuffer stringBuffer = new StringBuffer();
        String s = new String();
        for (int i = 0; i < args.length; i++) {
            s +=  args[i];
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuffer.append(s.charAt(i));
        }
        System.out.println((s.contentEquals(stringBuffer) ? "是" : "不是") + "回文");
    }
}