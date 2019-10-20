import java.util.*;
import java.time.*;
import java.lang.*;

public class Passager
{
   private String nom;
   private String contact;

   public  Passager( String n, String c){
      this.nom     = n;
      this.contact = c;
   }

   public String getName(){
      return this.nom;
   }
}