package dependency2;

public class Main {
    public static void main(String[] args) {
        Pengendara pengendara1 = new Pengendara("Cipto");
        SepedaMotor sepedaMotor1 = new SepedaMotor("Kawasaki");
        SepedaMotor sepedaMotor2 = new SepedaMotor("Yamaha");

        pengendara1.mengaktifkanMotor(sepedaMotor1);
        pengendara1.menonaktifkanMotor(sepedaMotor1);
        System.out.println(
            pengendara1.nama +
            " mematikan sepeda motor " +
            pengendara1.menonaktifkanMotor(sepedaMotor1).getMerk()
        );

        pengendara1.mengaktifkanMotor(sepedaMotor2);
        pengendara1.menonaktifkanMotor(sepedaMotor2);
        System.out.println(
            pengendara1.nama +
            " mematikan sepeda motor " +
            pengendara1.menonaktifkanMotor(sepedaMotor2).getMerk()
        );
    }
}
