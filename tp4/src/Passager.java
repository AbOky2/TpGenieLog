import java.util.*;

public class Passager
{
    private String nom;
    private String contact;
    private Reservation effectue;

    public Passager(String n, String c)
    {
        this.nom = n;
        this.contact = c;
    }
    public String getName()
    {
        return this.nom;
    }
}