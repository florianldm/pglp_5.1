package florianldm;

import java.time.LocalDate;
import java.time.Month;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Méthode main, exemple d'utilisation: création d'un groupe de.
     * @param args .
     */
    public static void main(final String[] args) {
        LocalDate d, d1;
        Personnel p, p1;
        Groupe g;

        d = LocalDate.of(1989, Month.DECEMBER, 5);
        d1 = LocalDate.of(1967, Month.AUGUST, 14);
        p = new Personnel.Builder("Martin", "Jean", d).build();
        p1 = new Personnel.Builder("Pierre", "Michel", d1).build();
        g = new Groupe();

        g.add(p);
        g.add(p1);
    }
}
