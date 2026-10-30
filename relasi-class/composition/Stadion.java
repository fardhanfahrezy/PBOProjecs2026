package composition;

import java.util.ArrayList;

public class Stadion{

    String namaStadion;
    ArrayList<Tribun> daftarTribun;

    public Stadion(String namaStadion){
        this.namaStadion = namaStadion;
        daftarTribun = new ArrayList<>();
    }

    void menambahTribun(String namaTribun, int jumlahKursi){
        daftarTribun.add( new Tribun(namaTribun, jumlahKursi) );
    }

    String menampilkanInfoTribun(){
        String info = "Stadion " + this.namaStadion + " terdiri atas: ";
        for (Tribun tribun : daftarTribun) {
            info += "\n" + tribun.namaTribun + " dengan " + tribun.jumlahKursi + " kursi";
        }
        return info;
    }

}