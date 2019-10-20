import java.util.*;
import java.lang.*;
import java.time.*;


public class Main
{
    public static  void main(String[] args)
    {
        
        Vol v1 = new Vol ("ABC4", ZonedDateTime.parse("2012-06-30T13:30:40+01:00[Europe/London]"), ZonedDateTime.parse("2012-06-30T17:30:40+01:00[Europe/London]"));
        Client c1 = new Client("René", "CB", "+0758883719", "RG18");
        c1.reserver (new Date(), v1, "Oky", "+2177700342");
        System.out.println("---------------------------------------------");
        c1.payer(c1.tabReserv.get(0));
        System.out.println("---------------------------------------------");
        c1.reserver (new Date(), v1, "Salihou", "+227700542");
        System.out.println("---------------------------------------------");
        c1.payer(c1.tabReserv.get(1));
        System.out.println("---------------------------------------------");
        c1.reserver (new Date(), v1, "Jean", "+32177705342");
        System.out.println("---------------------------------------------");
        c1.payer(c1.tabReserv.get(2));
        System.out.println("---------------------------------------------");
        c1.reserver (new Date(), v1, "Raoul", "+42174700342");
        System.out.println("---------------------------------------------");
        c1.payer(c1.tabReserv.get(3));
        System.out.println("---------------------------------------------");
        c1.reserver (new Date(), v1, "René", "+07658883719");
        System.out.println("---------------------------------------------");
        c1.annuler(c1.tabReserv.get(3));
        System.out.println("---------------------------------------------");
        Reservation r = new Reservation (new Date(), v1, "Brice", "ACK222");
        System.out.println("---------------------------------------------");
        c1.annuler(r);
    }
}
