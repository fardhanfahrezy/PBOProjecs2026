package composition2;

public class Main {
    public static void main(String[] args) {
        Gedung gedung1 = new Gedung("GSC");
        gedung1.menambahkanRuangKelas("HPC", 30);
        gedung1.menambahkanRuangKelas("IoT", 31);
        gedung1.menambahkanRuangKelas("Animasi", 32);
        gedung1.menambahkanRuangKelas("Ruang Kelas 408", 29);
        gedung1.menambahkanRuangKelas("Ruang Kelas 410", 29);

        String infoGedung = gedung1.menampilkanInfoGedung();
        System.out.println(infoGedung);
    }
}
