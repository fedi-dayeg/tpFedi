package ExHeritage;
import Personne.Personne;
/**
 * Created by fedi on 22/11/2016.
 */
public class testpersonne {
    public static void main(String[] args)
    {
        Employe E1;

        E1=new Employe("fedi","dayeg");
        E1.setdateEmbauche("22/11/2016");
        System.out.println(E1.toString());
        E1.affiche();

        Directeur D1;
        D1= new Directeur("fedi", "dayeg","10/06/1994","M","celibataire","22/11/2016",10000);
        System.out.println(D1.toString());

        Conseille co;
        co=new Conseille("fedi","dayeg","10/06/1994","M","celibataire","22/11/2016");

        Client C1;
        C1=new Client("alfred","nobel","11/1871","M","marie","suisse",co);

        System.out.println(C1.toString());
    }
}
