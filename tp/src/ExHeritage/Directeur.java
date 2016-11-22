package ExHeritage;

/**
 * Created by fedi on 22/11/2016.
 */
public class Directeur extends Employe {
    protected float revenu;

    public Directeur (String nom, String prenom, String dateNaissance, String sexe, String etat,String dateEmbauche, float revenu )
    {
        super(nom,prenom,dateNaissance,sexe,etat,dateEmbauche);
        this.etat=etat;
    }

    public float getRevenu()
    {
        return revenu;
    }
    public void setdateEmbauche (float r)
    {
        this.revenu=r;
    }

    public String toString()
    {
        return ("Le nom :"+nom+"\n Le prenom "+prenom+"\n dateNaissance "+dateNaissance +"\n dateEmbauche" + dateEmbauche+"\n Revenu" +revenu);
    }
}
