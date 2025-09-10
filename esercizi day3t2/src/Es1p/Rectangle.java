package Es1p;

public class Rectangle {
    public double getArea;
    // attributi rettangolo
    private double height;

    // costruttore rettangolo
    private double length;

    // metodi

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;

    }

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


}
