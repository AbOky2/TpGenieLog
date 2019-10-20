import java.util.*;
import java.time.*;
import java.lang.*;

public class Client
{
    private String   nom;
    private String   paiement;
    private String   contact;
    private String   reference;
    public ArrayList<Reservation> tabReserv = new ArrayList<Reservation>();

/*FAIRE UN TABLEAU DE RESERVATION ET AJOUTER POUR CHAQUE RESERVATION, ET POUR ANNULER FAUT VERIFIER SI LA RESERVATION Q'UON VEUT ANNULER EST DANS LE TABLEAU*/
    public Client( String n, String p, String c, String r) {
        this.nom       = n;
        this.paiement  = p;
        this.contact   = c;
        this.reference = r;
    }

    public void reserver (Date dateReser, Vol v, String nom, String contac) {
        
        Reservation r = new Reservation (dateReser, v, nom, contac);
        if( r.getEtat() == "confirmer"){
            tabReserv.add(r);
        }
    }

    public void payer(Reservation r) {
        if (r.getEtat() == "confirmer" && tabReserv.contains(r)){
            r.payer();
        }
    }

    public void annuler(Reservation r) {
        if (r.getEtat() != "annuler" && tabReserv.contains(r)){
            r.annuler();
            this.tabReserv.remove(r);
        }
        else {
            System.out.println("Ce client n'a pas le droit d'annuler cette reservation");
        }
    }
}