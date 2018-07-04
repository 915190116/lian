package Runnble;

public class Postman {
    private String postName;//邮递员姓名
    private int mailCount;//邮递员信件派送数量

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public int getMailCount() {
        return mailCount;
    }

    public void setMailCount(int mailCount) {
        this.mailCount = mailCount;
    }

    public Postman() {
    }

    public Postman(String postName, int mailCount) {
        this.postName = postName;
        this.mailCount = mailCount;
    }

}
