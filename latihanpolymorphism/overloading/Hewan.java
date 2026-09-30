public class Hewan {
    private double bobot = 0.5;
    private String nama = "default";

    public Hewan(double bobot, String nama){
        this.nama = nama;
        this.bobot = bobot;
    }

    public Hewan(double bobot){
        this.bobot = bobot;
    }

    public Hewan(String nama){
        this.nama = nama;
    }

    public void showHewan(){

        System.out.println("Nama: " + this.nama + "," + " Bobot: " + this.bobot + " kg");
    }

    public void showHewan(int umur){
        System.out.println("Nama: " + this.nama + "," + " Bobot: " + this.bobot + " kg" + "," + " Umur: " + umur + " Tahun");
    }

    public void berbicara(){
        System.out.println("Hewan sedang berbicara..");
    }
}