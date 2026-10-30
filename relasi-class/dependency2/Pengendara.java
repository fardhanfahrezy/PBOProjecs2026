package dependency2;

public class Pengendara {
    String nama;

    Pengendara(String nama){
        this.nama = nama;
    }

    void mengaktifkanMotor(SepedaMotor sepedaMotor){
        System.out.println(this.nama + " mengaktifkan motor  " + sepedaMotor.getMerk());
    }

    SepedaMotor menonaktifkanMotor(SepedaMotor sepedaMotor){
        return sepedaMotor;
    }
}
