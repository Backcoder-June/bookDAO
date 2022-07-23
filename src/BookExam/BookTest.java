package BookExam;


import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {



        BookDTO book1 = new BookDTO();
        Scanner sc = new Scanner(System.in);

        System.out.println("==책 정보를 입력하세요==");

        System.out.print("책 번호 : ");
        book1.setBookNo(sc.next());


        sc.nextLine();

        System.out.print("책 제목 : ");
        book1.setBookTitle(sc.nextLine());


        System.out.print("책 저자 : ");
        book1.setBookAuthor(sc.nextLine());

        System.out.print("책 연도 : ");
        book1.setBookYear(sc.next());

        System.out.print("책 가격 : ");
        book1.setBookPrice(sc.nextInt());

        sc.nextLine();

        System.out.print("출판사 : ");
        book1.setBookPublisher(sc.nextLine());

        BookDAO bookDAO = new BookDAO();

        bookDAO.insertBook(book1);



        System.out.println("==책 전체 목록 입니다==");

        bookDAO.selectBook();

    }
}