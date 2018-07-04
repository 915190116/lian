package Runnble;

public class MainClass {
    public static void main(String[] args) {
        Postman postman1 = new Postman("顺丰", 10);
        SendMails t1 = new SendMails();
        Thread thread1 = new Thread(t1);
        t1.setPost(postman1);
        thread1.start();

        Postman postman2 = new Postman("天天", 7);
        SendMails t2 = new SendMails();
        Thread thread2 = new Thread(t2);
        t2.setPost(postman2);
        thread2.start();

        Postman postman3 = new Postman("圆通", 5);
        SendMails t3 = new SendMails();
        Thread thread3 = new Thread(t3);
        t3.setPost(postman3);
        thread3.start();
    }
}
