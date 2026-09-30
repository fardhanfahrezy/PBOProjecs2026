public class Main {
    public static void main(String[] args) {
        //overriding
        Domba domba1 = new Domba(13, "Uci");
        domba1.berbicara();
        domba1.showHewan(12);

        // Upcasting
        Hewan dombaKuring = new Domba(9, "Fulan");
        dombaKuring.berbicara();
        dombaKuring.showHewan();
        //Downcasting
        Domba dombaGarut = (Domba) dombaKuring;
        dombaGarut.berbicara();
        dombaGarut.showHewan();
    }
}
