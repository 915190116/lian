public class FanXing {
    //泛型数组
    public static <E> void printArray(E[] input) {
        //输出数组元素
        for (E e :
                input) {
            System.out.printf("%s ", e);
        }
        System.out.println();

    }

    public static void main(String[] args) {
//        整型数组
        Integer[] integers = {1, 2, 3, 4, 5};
//        浮点型数组
        Double[] doubles = {1.1, 2.2, 3.3, 4.4};
//        字符型数组
        Character[] characters = {'H', 'E', 'L', 'L', 'O'};

        String[] aa = new String[]{"sad", "asdq11", "sxjdikaj"};
        printArray(aa);
        printArray(integers);
        printArray(doubles);
        printArray(characters);
    }
}
