public class Book implements Comparable<Book>{
    private String bookNo;

    private String bookName;
    private String author;
    private String publisher;
    private float price;
    public Book() {
    }

    public Book(String bookNo, String bookName, String author, String publisher, float price) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "书号:" + bookNo + "\t书名:" + bookName + "\t作者:" + author + "\t出版社:" + publisher + "\t价格:" + price;
    }

    public int compareTo(Book b) {
        return bookNo.compareTo(b.getBookNo());
    }
}
