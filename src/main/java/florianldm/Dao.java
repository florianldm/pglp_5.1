package florianldm;

import java.util.List;
import java.util.Optional;

/**
 * Interface pour DAO.
 * @param <T> type T.
 */
public interface Dao<T> {
    /** Méthode get. */
    Optional<T> get(long id);
    /** Méthode getAll. */
    List<T> getAll();
    /** Méthode save. */
    void save(T t);
    /** Méthode update. */
    void update(T t, String[] params);
    /** Méthode delete. */
    void delete(T t);
}
