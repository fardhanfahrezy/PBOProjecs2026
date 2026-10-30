package composition;

public class Main{

    public static void main(String[] args) {

        Stadion stadion1 = new Stadion("Garuda Jaya Prima");
        stadion1.menambahTribun("Tribun Utama (Grandstand)", 1000);
        stadion1.menambahTribun("Tribun VIP", 250);
        stadion1.menambahTribun("Tribun Ultras (Supporter)", 5000);
        stadion1.menambahTribun("Tribun Reguler (Ekonomi)", 2500);
        stadion1.menambahTribun("Tribun Media", 50);

        String infoStadion = stadion1.menampilkanInfoTribun();
        System.out.println(infoStadion);

    }

}