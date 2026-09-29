public class SepedaMotor {
    
    public String merk;
    public String warna;
    public int cc;

    // Constructor
    public SepedaMotor(String merk, String warna, int cc){
        this.merk = merk;
        this.warna = warna;
        this.cc = cc;
    }

    public void melaju(){
        System.out.println(this.merk);
        System.out.println(this.warna);
        System.out.println(this.cc);
        System.out.println("Melaju");
    };

    public void melambat(){
        System.out.println(this.merk);
        System.out.println(this.warna);
        System.out.println(this.cc);
        System.out.println("Melambat");
    };
}