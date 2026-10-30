package association.bidirectional;

public class PemainBola {

    Pelatih pelatih;
    String posisi;

    PemainBola(String posisi){
        this.posisi = posisi;
    }

    void menerimaInstruksi(Pelatih pelatih){
        System.out.println("Pemain bola menerima instruksi " +
        "dengan strategi " + pelatih.strategi);
    }

}