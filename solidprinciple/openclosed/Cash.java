package openclosed;

public class Cash implements TipePembayaran{
    @Override 
    public void memprosesPembayaran(){
        System.out.println("Pembayaran di lakukan dengan Cash");
    }
}
