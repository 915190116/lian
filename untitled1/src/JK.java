public class JK {
    public static String a;

    public String ZhuanHuan(String str) {

        String h = str.substring(0, 2);

        if (h.equals("01")) {
            a = Int2Hex(str);
            a = "(int)" + a;
        } else if (h.equals("02")) {
            a = Float2Hex(str);
            a = "(float)" + a;
        } else if (h.equals("0F")) {
            a = "";
            byte[] b = String2Hex(str);
            for (int i = 0; i < b.length; i++) {

                char g = (char) b[i];
                a += String.valueOf(g);
            }
            a = "(char)" + a;
        }
        return a;
    }

    //转化为int类型
    public String Int2Hex(String st) {
        String str = st.substring(2, st.length());
        if (str == null) {
            return null;
        }
        int q = Integer.parseInt(str, 16);
        return String.valueOf(q);
    }

    //转化为float类型
    public String Float2Hex(String st) {
        String str = st.substring(2, st.length());
        if (str == null) {
            return null;
        }
        String q = String.valueOf(Float.intBitsToFloat(Integer.valueOf(str.trim(), 16)));
        return String.valueOf(q);
    }

    //转化为ascii
    public byte[] String2Hex(String st) {
        String str = st.substring(2, st.length());
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        byte[] byteArray = new byte[str.length() / 2];
        for (int i = 0; i < byteArray.length; i++) {
            String subStr = str.substring(2 * i, 2 * i + 2);
            byteArray[i] = ((byte) Integer.parseInt(subStr, 16));
        }
        return byteArray;
    }
}