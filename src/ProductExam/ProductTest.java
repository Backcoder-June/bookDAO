package ProductExam;

public class ProductTest {
    public static void main(String[] args) {

        ProductDTO notebook = new ProductDTO(100, "노트북", 1200000,
                2021, "삼성");

        ProductDTO ipad = new ProductDTO(200, "아이패드", 500000,
                2022, "애플");

        ProductDTO mouse = new ProductDTO(200, "마우스", 15000,
                2021, "LG");


        System.out.println("상품번호" + "\t" + "상품명" + "\t" + "가격" + "\t\t" + "제조년도" + "\t" + "제조사\n" +
                "==================================================");

        System.out.println(notebook);
        System.out.println(ipad);
        System.out.println(mouse);

        System.out.println("==================================================");

    }
}