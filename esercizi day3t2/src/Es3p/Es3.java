package Es3p;

public class Es3 {

    public static void main(String[] args) {


        Article biscuit = new Article(23, "cookies", 12.2, 10);

        Chart carrello = new Chart(345, 150.40, new String[5]);
        carrello.getArtList()[0] = "oreos";
        carrello.getArtList()[1] = "ham";
        carrello.getArtList()[2] = "nutella";
        carrello.getArtList()[3] = "potatoes";
        carrello.getArtList()[4] = "chicken";


        Client firstBuyer = new Client(346, "paperino", "rossi", "paperino39@gmail.com", "29/10");

        System.out.println(biscuit);
        System.out.println(carrello);
        System.out.println(firstBuyer);
    }
}







