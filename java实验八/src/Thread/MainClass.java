package Thread;

public class MainClass {
    public static void main(String[] args) {
        Postman postman1 = new Postman("顺丰", 10);
        SendMails t1 = new SendMails();
        t1.setPost(postman1);
        t1.start();

        Postman postman2 = new Postman("天天", 7);
        SendMails t2 = new SendMails();
        t2.setPost(postman2);
        t2.start();

        Postman postman3 = new Postman("圆通", 5);
        SendMails t3 = new SendMails();
        t3.setPost(postman3);
        t3.start();
    }
}
