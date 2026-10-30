package openclosed;

public class PembayaranCustomer {
    public void menerimaPembayaran(TipePembayaran tipe){
        tipe.memprosesPembayaran();
    }
}
