package association.bidirectional;

public class Main {

    public static void main(String[] args) {
        Pelatih pelatih1 = new Pelatih("menyerang");
        PemainBola pemainBola1 = new PemainBola("Penyerang");
        PemainBola pemainBola2 = new PemainBola("Gelandang Serang");

        pelatih1.menambahPemain(pemainBola1);
        pelatih1.menambahPemain(pemainBola2);
        pelatih1.memberiInstruksi(0);
        pelatih1.memberiInstruksi(1);
        pemainBola1.menerimaInstruksi(pelatih1);
        pemainBola2.menerimaInstruksi(pelatih1);
    }

}