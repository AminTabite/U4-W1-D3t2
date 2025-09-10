package Es2p;

import java.util.Arrays;

public class Sim {
    Chiamata[] lastcalls;
    // attributi sim
    private long phoneNumber;
    private double credit;

    // metodi

    public Sim(long phoneNumber, double credit, Chiamata[] lastcalls) {
        this.phoneNumber = phoneNumber;
        this.credit = credit;
        this.lastcalls = lastcalls;
    }

    //metodi

    @Override
    public String toString() {
        return "Sim{" +
                "phoneNumber=" + phoneNumber +
                ", credit=" + credit +
                ", lastcalls=" + Arrays.toString(lastcalls) +
                '}';
    }


}
