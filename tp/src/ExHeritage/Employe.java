package ExHeritage;

/**
 * Created by fedi on 22/11/2016.
 */
import Personne.Personne;

public class Employe extends Personne {
    protected String dateEmbauche;

    public Employe (String Nom, String prenom)
    {
        super(Nom, prenom);
    }

    public Employe(String Nom,String prenom,String dateNaissance, String sexe, String etat,String dateEmbauche)
    {
        super(Nom,prenom,dateNaissance,sexe,etat);
        this.dateEmbauche=dateEmbauche;
    }

    public String Getprenom()
    {
        return prenom;
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
