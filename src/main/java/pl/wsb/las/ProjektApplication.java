package pl.wsb.projekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Punkt startowy aplikacji.
 *
 * <p>LAB 01: zmień pakiet {@code pl.wsb.projekt} na {@code pl.wsb.<nazwaprojektu>}
 * (np. {@code pl.wsb.kawiarnia}), a klasę na {@code <NazwaProjektu>Application}.
 * Reguła R1.01 sprawdza, czy to zrobiliście.
 */
@SpringBootApplication
public class ProjektApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjektApplication.class, args);
    }
}
