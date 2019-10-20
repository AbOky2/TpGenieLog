import java.util.*;
import java.time.*;
import java.lang.*;

public class Vol
{
    private String identifiant;
    private ZonedDateTime depart;
    private ZonedDateTime arrivee;    
    public final int NBRPLACE = 4;
    public int compte = 0;

    public Vol (String id, ZonedDateTime dep, ZonedDateTime arr)
    {
        this.identifiant = id;
        this.depart = dep;
        this.arrivee = arr;
        
    }

    public Duration duree() 
    {

        return(Duration.between(this.arrivee,this.depart));
    }

    public int ouvrir() {
        if(compte == NBRPLACE){
            this.fermee();
            return -1;
        }
        System.out.println("Vol est ouvert");
        return 0;
    }

    public int fermee() 
    {
        if( compte < NBRPLACE) 
        {
            this.ouvrir();
            return 0;
        }
        System.out.println("Vol est plein");
        return -1;
    }

    public String getId()
    {
        return this.identifiant;
    }

}
