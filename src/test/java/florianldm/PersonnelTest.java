package florianldm;
import org.junit.*;

import java.io.File;
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

    /**
     * Test de serialisation et deserialisation.
     */
    @Test
    public void testSerialisation() {
        File file = new File("personnel.p");
        LocalDate d = LocalDate.of(1989, Month.DECEMBER,5);
        Personnel p = new Personnel.Builder("Martin", "Jean", d).build();
        p.serialize("personnel.p");
        Personnel p1 = p.deserialize("personnel.p");
        if (file.delete()) {
            Assert.assertEquals(p1.nom(),p.nom());
        }
        else Assert.assertEquals("1","2");
    }
}
