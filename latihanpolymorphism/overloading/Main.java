public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan(12.0, "Juki");
        Hewan hewan2 = new Hewan("Joko");
        Hewan hewan3 = new Hewan(12.0);

        hewan1.berbicara();
        hewan1.showHewan(4);
        hewan1.showHewan();

        hewan2.berbicara();
        hewan2.showHewan(6);
        hewan2.showHewan();

        hewan3.berbicara();
        hewan3.showHewan(8);
        hewan3.showHewan();
    }
}
