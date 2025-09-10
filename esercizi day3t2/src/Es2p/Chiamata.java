package Es2p;

public class Chiamata {
    //attributi
    private long phonenumber;
    private double duration;
    // costruttore

    public Chiamata(long phonenumber, double duration) {

        this.duration = duration;
        this.phonenumber = phonenumber;
    }

    // metodo


    @Override
    public String toString() {
        return "Chiamata{" +
                "phonenumber=" + phonenumber +
                ", duration=" + duration +
                '}';
    }
}
