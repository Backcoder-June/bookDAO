package BookExam;

import java.sql.*;
import java.util.ArrayList;

public class BookDAO {

        public void selectBook() {
            Connection con = null;

            ArrayList<BookDTO> booklist = new ArrayList<>();

            try {
                con = DriverManager.getConnection
                        ("jdbc:mysql://127.0.0.1:3306/memberdb","june", "1111");
//SQL

                String sql =
                        "select * from book";

                PreparedStatement ps = con.prepareStatement(sql);

                ResultSet resultSet = ps.executeQuery();

                while (resultSet.next()) {
                    BookDTO bookDTO = new BookDTO(resultSet.getString(1),
                            resultSet.getString(2), resultSet.getString(3),
                            resultSet.getString(4), resultSet.getInt(5),
                            resultSet.getString(6));

                    booklist.add(bookDTO);
                }

                for (BookDTO book: booklist
                     ) {
                    System.out.println(book);
                }

            } catch (SQLException e) {
                System.err.println("연결 오류" + e.getMessage());
                e.printStackTrace();
            } finally {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }



    public void insetBook(BookDTO bookDTO) {
        Connection con = null;
        try {
            con = DriverManager.getConnection
                    ("jdbc:mysql://127.0.0.1:3306/memberdb", "june", "1111");
//SQL

            String sql =
                    "insert into book values(?, ?, ?, ?, ?, ?)";


            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,bookDTO.getBookNo());
            pr.setString(2,bookDTO.getBookTitle());
            pr.setString(3,bookDTO.getBookAuthor());
            pr.setString(4,bookDTO.getBookYear());
            pr.setInt(5,bookDTO.getBookPrice());
            pr.setString(6,bookDTO.getBookPublisher());


            pr.executeUpdate();


        } catch (SQLException e) {
            System.err.println("연결 오류" + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
            }
        }
    }







}
