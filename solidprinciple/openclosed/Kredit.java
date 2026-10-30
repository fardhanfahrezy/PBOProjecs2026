package openclosed;

public class Kredit implements TipePembayaran{
    @Override 
    public void memprosesPembayaran(){
        System.out.println("Pembayaran dilakukan dengan Kredit");
    }
}
