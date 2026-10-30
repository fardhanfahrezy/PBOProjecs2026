public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.create();
        mahasiswa1.read();
        mahasiswa1.update();
        mahasiswa1.delete();

        Dosen dosen1 = new Dosen();
        dosen1.create();
        dosen1.read();
        dosen1.update();
        dosen1.delete();
    }
}
