package ExHeritage;

/**
 * Created by fedi on 23/11/2016.
 */
public class Agence {
    private String adresse;
    Employe[] listEmp;
    Client[] listClient;
    private int nbEmp;
    private int nbClt;


    public Agence(String adresse) {
        this.adresse = adresse;
        listEmp = new Employe[50];
        listClient = new Client[50];
        this.nbEmp = 0;
        this.nbClt = 0;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getnbEmp() {
        return nbEmp;
    }

    public int getnbClt() {
        return nbClt;
    }

    public void addEmployer(Employe e) {
        ++nbEmp;
        listEmp[nbEmp] = e;
    }

    public void addClient(Client c) {
        ++nbClt;
        listClient[nbClt] = c;
    }

    public Employe getEmployer(String nom, String prenom) {
        for (int i = 0; i < nbEmp; i++) {
            if ((listEmp[nbEmp].getNom().equals(nom)) && (listEmp[nbEmp].getprenom().equals(prenom)))
                return listEmp[nbEmp];
        }
        return null;
    }

    public Client getClient(String nom, String prenom) {
        for (int j = 0; j < nbClt; j++) {
            if ((listClient[nbClt].getNom().equals(nom)) && (listClient[nbClt].getNom().equals(prenom)))
                return listClient[nbClt];
        }
        return null;
    }

    public void deleteEmploye(String nom, String prenom) {
        Employe em = getEmployer(nom, prenom);


        if (em != null)
            for (int i = 0; i < nbEmp; i++) {
                listEmp[i + 1] = listEmp[i];

            }
    }

    public void deleteClient(String nom, String prenom) {
        Client c = getClient(nom, prenom);

        if (c != null)
            for (int i = 0; i < nbClt; i++) {
                listClient[i + 1] = listClient[i];
            }

    }

    public void afficheListEmp()
    {
        for (int i=0; i<nbEmp;i++)
        {
            System.out.println(listEmp[i].toString());
        }
    }

    public void afficheListClient()
    {
        for (int i=0;i<nbClt;i++)
        {
            System.out.println(listClient[i].toString());
        }
    }
}
