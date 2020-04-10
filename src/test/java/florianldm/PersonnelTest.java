package florianldm;
import org.junit.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class PersonnelTest {

    /**
     * Test initialisation.
     */
    @Test
    public void initPersonnel() {
        LocalDate d = LocalDate.of(1989, Month.DECEMBER,5);
        Personnel p = new Personnel.Builder("Martin", "Jean", d).build();
        Assert.assertTrue(p != null);
    }
}
