package composition2;

import java.util.ArrayList;

public class Gedung {
    String namaGedung;
    ArrayList<RuangKelas> daftarRuangKelas;

    public Gedung(String namaGedung){
        this.namaGedung = namaGedung;
        daftarRuangKelas = new ArrayList<>();
    }

    void menambahkanRuangKelas(String namaRuangKelas, int jumlahKursi){
        daftarRuangKelas.add(new RuangKelas(namaRuangKelas, jumlahKursi));
    }

    String menampilkanInfoGedung(){
        String info = "Gedung " + this.namaGedung + " terdiri atas: ";
        for(RuangKelas ruangKelas : daftarRuangKelas){
            info += "\n" + ruangKelas.namaRuangKelas + " dengan " + ruangKelas.jumlahKursi + " kursi";
        }
        return info;
    }
}
