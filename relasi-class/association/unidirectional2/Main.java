package association.unidirectional2;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Islam ala prabowo");
        Buku buku2 = new Buku("10 dosa besar soeharto");
        Lemari lemari1 = new  Lemari();

        lemari1.menambahkanDaftarBuku(buku1);
        lemari1.menambahkanDaftarBuku(buku2);
        lemari1.menampilkanBuku(0);
        lemari1.menampilkanBuku(1);
    }
}
