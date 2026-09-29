public class AkunBank {
    private int saldo;

    public void transfer(int nominal){
        if (this.saldo - nominal <= 10000) {
            System.out.println("Saldo anda kurang, saldo anda tersisa ");
            return;
        }else{
            System.out.println("Transfer berhasil");
        }
        this.saldo -= nominal;
    }

    public void deposit(int jumlah){
        System.out.println("Deposite berhasil");
        this.saldo += jumlah;
    }

    public int getSaldo() {
        return saldo;
    }
}