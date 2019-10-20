import java.util.*;
import java.lang.*;
import java.time.*;

public class Reservation
{
    public Date date;
    public Double identifiant;
    public String etat;
    private Client propose;
    private Passager personne;
    public Vol vol;

    Random rand = new Random();

    public Reservation(Date d, Vol v, String n, String c)
    {
        if(v.ouvrir() == -1)
        {
            System.out.println("Impossible de reserver actuellement");
            this.etat = "annuler";
            return ;
        }
    


            Passager p = new Passager(n,c);
            this.personne = p;
            this.date = d;
            this.identifiant = new Double(rand.nextInt(2000));
            this.vol = v;
            this.confirmer();
    }

    public void annuler()
    {
        if(this.etat == "annuler")
        {
            System.out.println("Votre reservation est deja annulee");
            return;
        }
        this.identifiant = -1.;
        this.vol.compte = this.vol.compte -1;

        if(this.etat == "confirmer")
        {
            System.out.println("Votre reservation a bien ete annulee.");
        }
        if(this.etat == "payer")
        {
            System.out.println("Votre reservation a ete annulee et ne sera pas remboursee. ");
        }
        this.etat = "annuler";
    }
    public void confirmer()
    {
        System.out.println("La reservation du passager "+ this.personne.getName() +" pour le vol numero "+ this.vol.getId()+" est confirmer");
        this.etat = "confirmer";
    }


    public void payer()
    {
        System.out.println("Votre paiement a ete accepte");
        this.etat = "payer";
        this.vol.compte = this.vol.compte +1;
    }

    public String getEtat()
    {
        return this.etat;
    }
}
