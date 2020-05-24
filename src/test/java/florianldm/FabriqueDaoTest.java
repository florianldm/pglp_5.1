package florianldm;
import org.junit.*;

import java.io.File;
import java.time.LocalDate;
import java.time.Month;

public class FabriqueDaoTest {


    /**
     * Test de la création d'un GroupeDao.
     */
    @Test
    public void testFabriqueGroupe() {
        Dao<Groupe> g = FabriqueDao.getGroupeDao();
        Assert.assertNotNull(g.getAll());
    }

    /**
     * Test d'une serialisation d'un groupe obtenu avec la fabrique.
     */
    @Test
    public void testSerialisationGroupe() {
        GroupeDao g1 = (GroupeDao) FabriqueDao.getGroupeDao();
        Groupe g = new Groupe();
        g1.save(g);
        File file = new File("groupe.g");
        g1.getAll().get(0).serialize("groupe.g");
        Groupe g2 = g1.getAll().get(0).deserialize("groupe.g");
        if (file.delete()) {
            Assert.assertEquals(g1.getAll().get(0).getC(),g2.getC());
        }
        else Assert.assertEquals("4","2");
    }
}
