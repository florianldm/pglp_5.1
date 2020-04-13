package florianldm;

import java.util.List;
import java.util.Optional;

public class PersonnelDao implements Dao<Personnel> {

    /** Liste de personnels */
    private List<Personnel> personnels;

    /**
     * Getter.
     * @param id .
     * @return optional type Personnel.
     */
    @Override
    public Optional<Personnel> get(long id) {
        return Optional.empty();
    }

    /**
     * Retourne Liste de personnels.
     * @return liste.
     */
    @Override
    public List<Personnel> getAll() {
        return personnels;
    }

    /**
     * Ajout de personnel.
     * @param personnel .
     */
    @Override
    public void save(Personnel personnel) {
        personnels.add(personnel);
    }

    /**
     * Mise à jour Personnel.
     * @param personnel .
     * @param params tableau.
     */
    @Override
    public void update(Personnel personnel, String[] params) {
        System.out.println("Maj Personnel");
    }

    /**
     * Supprime un personnel.
     * @param personnel .
     */
    @Override
    public void delete(Personnel personnel) {
        personnels.remove(personnel);
    }
}
