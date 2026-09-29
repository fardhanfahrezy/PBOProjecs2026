public class Main {
    public static void main(String[] args) {
        System.out.println("=== START SIMULASI PENGIRIMAN ===");
        ParcelDelivery paket = new ParcelDelivery("ID-99281-XYZ", 2.5);

        System.out.println("Status Awal: " + paket.getCurrentStatus());
        System.out.println("Lokasi Awal: " + paket.getCurrentLocation());
        System.out.println("-----------------------------------");

        // UJI COBA 1: Mencoba mengubah lokasi saat masih PROCESSED (Harus Gagal)
        System.out.println("[Uji Coba 1] Mencoba memperbarui lokasi ke 'Bandung'...");
        paket.updateLocation("Bandung");

        // UJI COBA 2: Lompat status langsung ke DELIVERED (Harus Gagal)
        System.out.println("\n[Uji Coba 2] Mencoba paksa status langsung ke 'DELIVERED'...");
        paket.updateStatus("DELIVERED");

        // UJI COBA 3: Alur yang benar (Harus Berhasil)
        System.out.println("\n[Uji Coba 3] Mengubah status ke 'SHIPPED'...");
        paket.updateStatus("SHIPPED");
        System.out.println("Status Sekarang: " + paket.getCurrentStatus());

        System.out.println("\nMemperbarui lokasi ke 'Rest Area KM 57'...");
        paket.updateLocation("Rest Area KM 57");
        System.out.println("Lokasi Sekarang: " + paket.getCurrentLocation());

        // UJI COBA 4: Menyelesaikan pengiriman (Harus Berhasil)
        System.out.println("\n[Uji Coba 4] Mengubah status ke 'DELIVERED'...");
        paket.updateStatus("DELIVERED");
        System.out.println("Status Akhir: " + paket.getCurrentStatus());

        // UJI COBA 5: Mencoba mengubah lokasi atau status setelah DELIVERED (Harus Gagal)
        System.out.println("\n[Uji Coba 5] Mencoba mengubah lokasi setelah paket diterima...");
        paket.updateLocation("Rumah Penerima");

        System.out.println("\nMencoba mengembalikan status ke 'SHIPPED'...");
        paket.updateStatus("SHIPPED");
    }
}