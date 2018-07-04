public class Average {
    public static void main(String[] args) {
        int a = 0;
        try {
            for (String str : args) {
                if (Integer.parseInt(str) <= 0) {
                    throw new NotPositiveException();
                }
                a += Integer.parseInt(str);
            }
            int argv = a / args.length;
            System.out.println("参数的平均值是: " + argv);
        } catch (ArithmeticException e1) {
            System.out.println("应该带参数运行");
        } catch (NumberFormatException e2) {
            System.out.println("参数格式不正确");
        } catch (NotPositiveException e3) {
            System.out.println(e3.getMessage());
        } catch (Exception e4) {
            System.out.println("其他错误");
        }
        System.out.println("程序结束!");
    }
}

class NotPositiveException extends Exception {
    public NotPositiveException() {
        super("参数不是正整数");
    }
}