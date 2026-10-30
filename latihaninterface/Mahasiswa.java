public class Mahasiswa implements OperasiCRUD{

    @Override
    public void create() {
        System.out.println("Membuat data mahasiswa");
    }

    @Override
    public void read() {
        System.out.println("Membaca data mahasiswa");
    }

    @Override
    public void update() {
        System.out.println("Mengubah data mahasiswa");
    }

    @Override
    public void delete() {
        System.out.println("Menghapus data mahasiswa");
    }
    
}
