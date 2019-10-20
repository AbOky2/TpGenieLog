import java.util.*;
import java.time.*;
import java.lang.*;


public class Reservation {

    public Date date ;
    public Double identifiant;
    private String etat;
    public Passager personne;
    public Vol vol;

    Random rand = new Random();

    public Reservation (Date d, Vol v, String n, String c){
        if(v.ouvrir() == -1){
            System.out.println("Impossible de reserver actuellemnt");
            this.etat ="annuler";
            return ;
        } /*verifier si le vol est ouverrt et si oui incrementer les compteur de place du vol 
            ensuite donnee la reseration au client ou passager */
        Passager p = new Passager(n, c);
        this.personne = p;
        this.date = d;
        this.identifiant = new Double(rand.nextInt(2000));
        this.vol = v;
        this.confirmer();
    }

    public void annuler() {
        if (this.etat == "annuler"){
            System.out.println("Votre reservation est déja annulée");
            return ;
            
        }

        this.identifiant = -1.;
        this.vol.compte = this.vol.compte - 1;

        if(this.etat == "confirmer" ){
            System.out.println("Votre reservation a bien été annulée.");
        }

        if (this.etat == "payer") {
            System.out.println("Votre reservation a bien été annulée et ne sera pas remboursée.");
        }
        
        this.etat = "annuler";
    }

    public void confirmer() {
        System.out.println("Votre reservation pour le passager " + this.personne.getName() + " sur le vol numero " + this.vol.getId() +" est confirmée");
        this.etat = "confirmer";
    }

    public void payer () {
        System.out.println("Votre paiement a été accepté.");
        this.etat = "payer";
        this.vol.compte = this.vol.compte + 1;
    }

    public String getEtat() {
        return this.etat;
    }
}