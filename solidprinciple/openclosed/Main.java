
package openclosed;

public class Main {
    public static void main(String[] args) {

        Debit debit = new Debit();
        Cash cash = new Cash();
        Kredit kredit = new Kredit();

        PembayaranCustomer kasir = new PembayaranCustomer();

        kasir.menerimaPembayaran(debit);
        kasir.menerimaPembayaran(cash);
        kasir.menerimaPembayaran(kredit);
    }
}
