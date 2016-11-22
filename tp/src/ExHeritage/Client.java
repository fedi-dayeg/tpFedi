package ExHeritage;

import Personne.Personne;

/**
 * Created by fedi on 22/11/2016.
 */
public class Client extends Personne {

    private String adresse;
    private Conseille agentConseille;

    public Client (String nom,String prenon,String dateNaissance, String sexe, String etat,String adresse, Conseille agentConseille)
    {
        super(nom,prenon,dateNaissance,sexe,etat);
        this.adresse=adresse;
        this.agentConseille=agentConseille;
    }

    public String getadresse()
    {
        return adresse;
    }
    public Conseille getagentConseille()
    {
        return agentConseille;
    }

    public void setadresse(String adresse)
    {
        this.adresse=adresse;
    }
    public void setagentConseille (Conseille c)
    {
        this.agentConseille=c;
    }

    public String toString()
    {
        return ("Le nom :"+nom+"\n Le prenom "+prenom+"\n dateNaissance "+dateNaissance +"\n adresse" +adresse+"\n agent conseille "+agentConseille);
    }
}
