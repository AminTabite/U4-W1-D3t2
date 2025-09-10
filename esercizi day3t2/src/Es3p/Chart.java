package Es3p;

import java.util.Arrays;

public class Chart {
    //attributi
    private int clientIdassociated;
    private double totalcost;
    private String[] artList;


    //costruttori

    public Chart(int clientIdassociated, double totalcost, String[] artList) {
        this.clientIdassociated = clientIdassociated;
        this.totalcost = totalcost;
        this.artList = artList;
    }

    @Override
    public String toString() {
        return "Chart{" +
                "clientIdassociated=" + clientIdassociated +
                ", totalcost=" + totalcost +
                ", artList=" + Arrays.toString(artList) +
                '}';
    }


    //metodi
}
