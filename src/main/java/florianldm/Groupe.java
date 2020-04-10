package florianldm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Groupe implements Composant {
    /** Collection représentant le personnel du groupe. */
    private Collection c;

    /**
     * Constructeur.
     */
    public Groupe() {
        c = new ArrayList();
    }

    /**
     * Ajout d'un personnel dans le groupe.
     * @param comp composant.
     */
    public void add(final Composant comp) {
        c.add(comp);
    }

    /**
     * Suppression d'un personnel du groupe.
     * @param comp composant.
     * @return boolean.
     */
    public boolean remove(final Composant comp) {
        if (!c.isEmpty()) {
            c.remove(comp);
            return true;
        } else {
            return false;
        }
    }

    /** Parcours du groupe et affiche les membres. */
    @Override
    public void afficheNom() {
        System.out.println("Avec iterator: ");
        for (Iterator i = c.iterator(); i.hasNext();) {
            Object objet = i.next();
            Composant composant = (Composant) objet;
            composant.afficheNom();
        }
    }
}
