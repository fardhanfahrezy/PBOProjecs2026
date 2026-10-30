package association.unidirectional;

public class Main {
    public static void main(String[] args) {
        PemainBola pemainBola1 = new PemainBola("Striker");
        PemainBola pemainBola2 = new PemainBola("Gelandang Serang");
        Supporter supporter1 = new Supporter();

        supporter1.menambahDaftarIdola(pemainBola1);
        supporter1.menambahDaftarIdola(pemainBola2);
        supporter1.memberiDukungan(0);
        supporter1.memberiDukungan(1);
    }
}
