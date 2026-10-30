package association.unidirectional2;

import java.util.ArrayList;

public class Lemari {
    ArrayList<Buku> daftarBuku;

    Lemari(){
        this.daftarBuku = new ArrayList<>();
    }

    void menambahkanDaftarBuku(Buku buku){
        daftarBuku.add(buku);
    }

    void menampilkanBuku(int nomorIndex){
        System.out.println(
            "Lemari menampilkan buku dengan judul "
            + daftarBuku.get(nomorIndex).judul
        );
    }
}
