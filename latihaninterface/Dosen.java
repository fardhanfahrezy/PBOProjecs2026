public class Dosen implements OperasiCRUD{

    @Override
    public void create() {
        System.out.println("Membuat data dosen");
    }

    @Override
    public void read() {
        System.out.println("Membaca data dosen");
    }

    @Override
    public void update() {
        System.out.println("Mengubah data dosen");
    }

    @Override
    public void delete() {
        System.out.println("Menghapus data dosen");
    }
    
}
