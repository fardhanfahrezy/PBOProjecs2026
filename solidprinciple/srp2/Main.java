package srp2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("2503069", "Fufu");
        Mahasiswa mhs2 = new Mahasiswa("2503096", "null")
        MahasiswaView view = new MahasiswaView();

        view.showMahasiswa(mhs1);
    }
}
