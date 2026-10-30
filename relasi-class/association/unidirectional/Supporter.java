package association.unidirectional;

import java.util.ArrayList;

public class Supporter {

    ArrayList<PemainBola> daftarIdola;

    Supporter(){
        this.daftarIdola = new ArrayList<>();
    }
    
    void menambahDaftarIdola(PemainBola idola){
        daftarIdola.add(idola);
    }
    
    void memberiDukungan(int nomorIndex){
        System.out.println("Supporter memberi dukungan kepada " 
        + "pemain bola dengan posisi " + daftarIdola.get(nomorIndex).posisi);
    }

}