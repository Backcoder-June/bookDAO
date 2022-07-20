package BookExam;


public class BookDTO {


    @Override
    public String toString() {
        return "BookDTO{" +
                "책 번호='" + bookNo + '\'' +
                ", 책 제목='" + bookTitle + '\'' +
                ", 저자='" + bookAuthor + '\'' +
                ", 출판연도='" + bookYear + '\'' +
                ", 가격=" + bookPrice +
                ", 출판사='" + bookPublisher + '\'' +
                '}';
    }

    private String bookNo;
    private String bookTitle;
    private String bookAuthor;
    private String bookYear;
    private int bookPrice;
    private String bookPublisher;

    public BookDTO(){}
    public BookDTO(String bookNo, String bookTitle, String bookAuthor, String bookYear, int bookPrice, String bookPublisher) {
        this.bookNo = bookNo;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;
    }


    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
}
