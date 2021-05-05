import java.util.regex.*;
public class lastname {
   public static void main( String[] args ) {
      System.out.println(lastName("Bezos"));

   }

   public static boolean lastName( String lastName ) {
      return lastName.matches("^[A-Z]{1}[a-zA-Z]{3,}$");
   }
}
