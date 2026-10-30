package latihaninheritance.hierarchical;

public class Main {
    public static void main(String[] args) {

        KapalLaut pelni = new KapalLaut();
        pelni.bergerak();
        pelni.berlayar();

        Pesawat garuda = new Pesawat();
        garuda.bergerak();
        garuda.terbang();

    }
}
