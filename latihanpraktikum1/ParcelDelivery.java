public class ParcelDelivery {
    private final String TRACKING_NUMBER;
    private final double WEIGHT;
    private String currentStatus;
    private String currentLocation;

    public ParcelDelivery(String trackingNumber, double weight) {
        this.TRACKING_NUMBER = trackingNumber;
        this.WEIGHT = weight;
        this.currentStatus = "PROCESSED";
        this.currentLocation = "Gudang Pusat";
    }

    public String getTrackingNumber() {
        return this.TRACKING_NUMBER;
    }

    public double getWeight() {
        return this.WEIGHT;
    }

    public String getCurrentStatus() {
        return this.currentStatus;
    }

    public String getCurrentLocation() {
        return this.currentLocation;
    }

    public void updateStatus(String nextStatus) {
        if ("DELIVERED".equals(this.currentStatus)) {
            System.out.println("Menolak perubahan status ke: " + nextStatus + ". Paket yang sudah diterima tidak dapat diubah statusnya.");
            return;
        }

        boolean isValidTransition = ("PROCESSED".equals(this.currentStatus) && "SHIPPED".equals(nextStatus))
                || ("SHIPPED".equals(this.currentStatus) && "DELIVERED".equals(nextStatus));

        if (isValidTransition) {
            this.currentStatus = nextStatus;
        } else {
            System.out.println("Menolak perubahan status ke: " + nextStatus + ". Alur status tidak valid.");
        }
    }

    public void updateLocation(String newLocation) {
        if ("SHIPPED".equals(this.currentStatus)) {
            this.currentLocation = newLocation;
        } else {
            System.out.println("Gagal memperbarui lokasi. Paket tidak sedang dalam perjalanan!");
        }
    }
}