CREATE TABLE book (
  bookNo CHAR(10) NOT NULL PRIMARY KEY,
  bookTitle VARCHAR(30) NOT NULL,
  bookAuthor VARCHAR(20) NULL,
  bookYear DATE NULL,
  bookPrice INT NULL,
  bookPublisher VARCHAR(10) NULL); 
  
INSERT INTO book VALUES('B001', '자바프로그래밍', '홍길동', '2020-01-01', 30000, '멀티출판사');
    
INSERT INTO book VALUES('B002', 'MYSQL이해', '나이해', '2022-01-01', 25000, '캠퍼스출판');

INSERT INTO book VALUES('B003', 'SPRING활용', '김고수', '2021-01-01', 45000, '디지털출판사');
  
select * from book;

select bookNo 도서번호, bookTitle 도서제목, 
bookAuthor 저자, substr(bookyear,1,4) 발행연도, bookprice 가격, bookpublisher 출판사 from book; 