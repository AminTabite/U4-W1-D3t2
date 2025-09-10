package Es1p;

public class Rectangle {

    // attributi rettangolo
    private double height;


    private double length;

    // costruttore rettangolo

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;

    }

    // metodi
    public double getPerimeter() {
        return (height + length) * 2;
    }

    public double getGetArea() {
        return (height * length);
    }

    public void print1rectangle() {
        System.out.println("L'area del seguente rettangolo e'" + " " + this.getGetArea() + "" + ", il perimetro e' " + " " + this.getPerimeter());
        ;
    }


    public void print2rectangles(Rectangle re1, Rectangle re2) {
        System.out.println("la somma delle aree dei 2 rettangoli e'" + " " + re2.getGetArea() + re1.getGetArea() + " " + "la somma dei perimetri e' " + " " + re1.getPerimeter() + re2.getPerimeter());

    }

}
