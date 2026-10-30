package dependency;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Penyerang {

    Logger logger = Logger.getLogger(getClass().getName());

    String nama;

    Penyerang(String nama){
        this.nama = nama;
    }

    // Dependency: Menggunakan tipe data Bola sebagai parameter
    // Dependency: Memanggil tipe data Bola di dalam method

    void menendangBola(Bola bola){
        // Option 1: Built-in string formatting (java.util.logging style)
        logger.log(Level.INFO, "{0} menendang bola {1}", new Object[]{this.nama, bola.getMerk()});

        // Option 2 (Java 8+): Lazy evaluation via Supplier to avoid concatenation if log level is disabled
        logger.info(() -> this.nama + " menendang bola " + bola.getMerk());
    }

    Bola menerimaBola(Bola bola){
        return bola;
    }
}