package srp;

public class Main {
    public static void main(String[] args) {

        Persegi persegi = new Persegi(5);
        HitungPersegi hitung = new HitungPersegi();

        System.out.println("Sisi persegi: " + persegi.getSisi());
        System.out.println("Luas persegi: " + hitung.hitungLuas(persegi));
        
        persegi.setSisi(10);

        System.out.println("Setelah sisi diubah:");
        System.out.println("Sisi persegi: " + persegi.getSisi());
        System.out.println("Luas persegi: " + hitung.hitungLuas(persegi));
    }
}
