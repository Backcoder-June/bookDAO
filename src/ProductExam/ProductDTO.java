package ProductExam;

import java.time.LocalDate;

public class ProductDTO {

    private int prdNo;
    private String prdName;
    private int prdPrice;
    private int prdYear;
    private String prdMaker;

    public ProductDTO(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
        this.prdNo = prdNo;
        this.prdName = prdName;
        this.prdPrice = prdPrice;
        this.prdYear = prdYear;
        this.prdMaker = prdMaker;
    }

    @Override
    public String toString() {
        return
                prdNo +
                "      " + prdName +
                "      " + prdPrice +
                "      " + prdYear +
                "      " + prdMaker
                ;}
}
