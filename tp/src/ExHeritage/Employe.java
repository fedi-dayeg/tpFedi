package ExHeritage;

/**
 * Created by fedi on 22/11/2016.
 */
import Personne.Personne;

public class Employe extends Personne {
    protected String dateEmbauche;

    public Employe (String nom, String prenom)
    {
        super(nom, prenom);
    }

    public Employe(String nom,String prenon,String dateNaissance, String sexe, String etat,String dateEmbauche)
    {
        super(nom,prenon,dateNaissance,sexe,etat);
        this.dateEmbauche=dateEmbauche;
    }

    public String getdateEmbauche()
    {
        return dateEmbauche;
    }

    public void setdateEmbauche(String dE)
    {
        this.dateEmbauche=dateEmbauche;
    }

}
