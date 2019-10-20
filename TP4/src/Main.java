import java.util.*;
import java.time.*;
import java.lang.*;

public class Main {

    public static void main(String[] args)
    {
        Vol v1 = new Vol ("ABC4", ZonedDateTime.parse("2012-06-30T13:30:40+01:00[Europe/London]"), ZonedDateTime.parse("2012-06-30T17:30:40+01:00[Europe/London]"));
        Client c1 = new Client("René", "CB", "+0758883719", "RG18");
        c1.reserver (new Date(), v1, "Mamie", "+22177700342");
        c1.payer(c1.tabReserv.get(0));
        c1.reserver (new Date(), v1, "Angie", "+22177700542");
        c1.payer(c1.tabReserv.get(1));
        c1.reserver (new Date(), v1, "Binta", "+22177705342");
        c1.payer(c1.tabReserv.get(2));
        c1.reserver (new Date(), v1, "Safiie", "+22174700342");
        c1.payer(c1.tabReserv.get(3));
        System.out.println("---------------------------------------------");
        c1.reserver (new Date(), v1, "René", "+0758883719");
        //c1.payer(c1.tabReserv.get(4));
        System.out.println("---------------------------------------------");
        c1.annuler(c1.tabReserv.get(3));
        System.out.println("---------------------------------------------");
        /*c1.reserver (new Date(), v1, "René", "+0758883719");
        c1.payer(c1.tabReserv.get(3));
        System.out.println("---------------------------------------------");*/
        Reservation r = new Reservation (new Date(), v1, "vkvk", "cjjaéé33");
        c1.annuler(r);
    }
}