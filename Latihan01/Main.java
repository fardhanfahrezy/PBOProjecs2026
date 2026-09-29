/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        SepedaMotor motor1 = new SepedaMotor("Honda", "Hitam", 150);
        motor1.melaju();
        motor1.melambat();

        SepedaMotor motor2 = new SepedaMotor("Kawasaki", "Hijau", 200);
        motor2.melaju();
        motor2.melambat();
    }
}