package Personne;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by fedi on 05/10/2016.
 */
public class Personne {
    // public String nom;
    //  public String prenom;
    /*private*/ protected String nom;
    /*private*/  protected String prenom;
    /*public*/  protected String dateNaissance;
    /*public*/  protected String sexe;
    public Personne conjoint;
   public   String  etat;
    public  int age;



    public Personne()
    {
        this.nom=null;
        this.prenom=null;
        this.dateNaissance=null;
        this.sexe=null;
        this.conjoint=null;
        this.etat=null;
        this.age=0;
    }
    public Personne(String nom, String prenom)
    {
        this.nom=nom;
        this.prenom=prenom;

    }
    public Personne(String nom, String prenom,String dateNaissance, String sexe, String etat )
    {
        this.nom=nom;
        this.prenom=prenom;
        this.dateNaissance=dateNaissance;
        this.sexe=sexe;
        this.etat=etat;


    }
     public void affiche()
      {
          System.out.println(" nom: "+nom+" prénom "+prenom+" date de naissance "+dateNaissance+" sexe "+sexe);
      }
    public String getprenom()
    {
        return prenom;
    }

    public String getNom()
    {
        return nom;
    }

    public String getDatenaissance() {
        return dateNaissance;
    }


    //Declaration des SETHERS
    public void setNom(String nom)
    {
        this.nom=nom;
    }

    public void setprenon(String prenom)
    {
        this.prenom=prenom;
    }

    public void setDatenaissance(String dateNaissance)
    {
        this.dateNaissance=dateNaissance;
    }


    public String toString()
    {
        return "nom : "+this.nom+"\n prenom : "+this.prenom+"\nDate de naissance: "+dateNaissance+"\n sexe: "+sexe+" etat: "+etat/*+
                "\nconjoint\tnom : "+this.nom+"\n \tprenom : "+this.prenom+"\n\tDate de naissance: "+dateNaissance+"\n \tsexe: "+sexe*/;
    }


   /* public void  conjoint(Personne conjoint)
    {

        Scanner sc =new Scanner(System.in);

        System.out.println("donner l'etat ");
        String etat = sc.nextLine();
        if (etat.equals("mariee"))
            this.conjoint=conjoint;

        else
            this.conjoint=null;

    }*/
   /* public static int age (Personne [] t, String dateNaissance )
    {
        long ageInMillis = new Date().getTime() - this.dateNaissance().getTime();
        Date age = new Date(ageInMillis);
    }*/



}