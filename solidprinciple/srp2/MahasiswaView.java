package srp2;

public class MahasiswaView {
    public void showMahasiswa(Mahasiswa mhs){
        String nim = mhs.getNim();
        String nama = mhs.getNama();

        System.out.println(nama + " dengan NIM " + nim);
    }
}
