package Es3p;

public class Article {
    //attributi

    private int idarticle;
    private String descriptionarticole;
    private double price;
    private int pieces;


    //costruttore

    public Article(int idarticle, String descriptionarticole, double price, int pieces) {
        this.idarticle = idarticle;
        this.descriptionarticole = descriptionarticole;
        this.price = price;
        this.pieces = pieces;
    }
    //metodi


    @Override
    public String toString() {
        return "Article e' composto da {" +
                "idarticle=" + idarticle +
                ", descriptionarticole='" + descriptionarticole + '\'' +
                ", price=" + price +
                ", pieces=" + pieces +
                '}';
    }
}
