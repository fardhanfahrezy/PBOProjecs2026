package association.bidirectional;

import java.util.ArrayList;

public class Pelatih {

    ArrayList<PemainBola> daftarPemain = new ArrayList<>();
    String strategi;

    Pelatih(String strategi){
        this.strategi = strategi;
    }

    void memberiInstruksi(int nomorPemain){
        System.out.println("Pelatih memberi instruksi kepada " + 
        "pemain dengan posisi " + daftarPemain.get(nomorPemain).posisi);
    }

    void menambahPemain(PemainBola pemain){
        daftarPemain.add(pemain);
    }

}