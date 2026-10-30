public class Domba extends Hewan{
    
    public Domba(double bobot, String nama) {
        super(bobot, nama);
    }
    
    @Override 
    public void showHewan(int umur){
        System.out.println("Domba bernama " + this.nama);
        System.out.println("dengan bobot pa" + this.bobot + " kg");
        System.out.println("Berumur " + umur + " bulan");
    }

    @Override 
    public void berbicara(){
        System.out.println("Mbeeekkkkk");
    }
}
