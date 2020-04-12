package florianldm;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Groupe implements Composant, Serializable {
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

    /**
     * Permet d'écrire l'objet dans un fichier -> sérialisation.
     * @param File chemin vers le fichier.
     */
    public void serialize(final String File) {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(File)))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Permet de lire un objet de fichier -> désérialisation.
     * @param File chemin vers le fichier.
     */
    public void deserialize(final String File) {
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(File)))) {
            in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
