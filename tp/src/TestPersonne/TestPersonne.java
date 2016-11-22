package TestPersonne;
import Personne.Personne;

import java.util.Calendar;

/**
 * Created by fedi on 05/10/2016.
 */
public class TestPersonne {
    public static void main(String[] args) {

        Personne[] t ;
        t=new Personne[10];
        t[0]=new Personne("Florant","Patrice","18/09/1972","M","mariee");
        t[1]=new Personne("Florant","christine","18/09/1972","F","mariee");
        t[2]=new Personne("dayeg","fedi","18/09/1993","M","celeibataire");
        t[3]=new Personne("xyz","abc","18/09/2000","F","celibataire");
        t[4]=new Personne("ali","zroud","20/05/1993","M","mariee");
        t[5]=new Personne("Abir","roin","20/02/1995","F","celibataire");
        t[6]=new Personne("ahmed","abbes","02/05/1982","M","mariee");
        t[7]=new Personne("hatem","dfdvv","10/09/1985","M","celibataire");
        t[8]=new Personne("khayri","bouaker","15/28/1994","M","mariee");
        t[9]=new Personne("samah","dali","10/12/1995","M","celibataire");

        for (Personne i : t)
        {
            System.out.println(i);
        }
        int n=TestPersonne.maries(t);
        System.out.println("le nombre de personne mariee et " +n);



       // Personne p1, p2;
       // p1 = new Personne("Florant", "Patrice", "18/09/1972", "M");
      //  p2 = new Personne("Florant", "Christine", "11/06/1980", "F");

        // p1.affiche();
        //p2.affiche();
        //methode toString
      //  System.out.println(p1.toString());
      //  System.out.println(p2.toString());

       // System.out.println(p1 == p2);
       // System.out.println(p1.equals(p2));




    }
   public static int maries(Personne[] t) {
       int n = 0;

       for (int  i = 0; i < t.length; i++) {
           if (t[i].etat == "mariee")
           n++;
       }
       return n;
   }


}