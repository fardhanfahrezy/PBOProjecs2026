package aggregation;

import java.util.ArrayList;

public class Pelatih {

    String nama;
    ArrayList<Strategi> opsiStrategi;

    Pelatih(String nama){
        this.nama = nama;
        opsiStrategi = new ArrayList<>();
    }

    void menambahStrategi(Strategi strategi){
        opsiStrategi.add(strategi);
    }

    void menggunakanStrategi(int nomorIndex){
        System.out.println("Coach " + this.nama + 
        " menggunakan strategi dengan formasi " + 
        opsiStrategi.get(nomorIndex).formasi);
    }

}