import java.util.regex.*;
public class firstname {
   public static void main( String[] args ) {
      System.out.println(firstName("Jeff"));
      
   }
   
   public static boolean firstName( String firstName ) {
      return firstName.matches("^[A-Z]{1}[a-zA-Z]{3,}$");
   }
}
