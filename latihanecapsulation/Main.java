public class Main {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank();
        akun1.deposit(50000);
        System.out.println(akun1.getSaldo());

        akun1.transfer(70000);
        System.out.println(akun1.getSaldo());
    }
}