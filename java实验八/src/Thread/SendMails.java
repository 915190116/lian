package Thread;

public class SendMails extends Thread {
    private Postman post;//表示邮局派件人

    public Postman getPost() {
        return post;
    }

    public void setPost(Postman post) {
        this.post = post;
    }

    public SendMails() {
    }

    @Override
    public void run() {
        int a = 1;
        while (post.getMailCount() > 0) {
            post.setMailCount(post.getMailCount() - 1);
            System.out.println("邮递员:" + post.getPostName() + "正在发送第" + a++ + "份邮件,剩余" + post.getMailCount());
            try {
                SendMails.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("派件员" + post.getPostName() + "已完成所有派件");

    }
}
