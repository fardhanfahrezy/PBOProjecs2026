package aggregation;

public class Main {
    public static void main(String[] args) {
        Strategi strategi1 = new Strategi("4-3-3");
        Strategi strategi2 = new Strategi("4-4-2");
        Pelatih pelatih1 = new Pelatih("Justin");

        pelatih1.menambahStrategi(strategi1);
        pelatih1.menambahStrategi(strategi2);
        pelatih1.menggunakanStrategi(0);
        pelatih1.menggunakanStrategi(1);
    }
}
