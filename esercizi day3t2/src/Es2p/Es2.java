package Es2p;

public class Es2 {

    public static void main(String[] args) {
        Sim vodafone = new Sim(381231234, 0, new Chiamata[4]);

        Chiamata firstcall = new Chiamata(123456789, 12.34);
        Chiamata secondcall = new Chiamata(987654321, 5.32);

        System.out.printf(String.valueOf(vodafone));


        vodafone.lastcalls[0] = firstcall;
        vodafone.lastcalls[1] = secondcall;


        System.out.printf(String.valueOf(vodafone));
    }

}
