import java.util.regex.*;
public class email {
   public static void main( String[] args ) {
      System.out.println(email("abc@gmail.com.aa.au"));

   }

   public static boolean email( String email ) {
      return email.matches("^[0-9a-zA-z]+([._+-][0-9a-zA-z]*)*"+
               "@([a-zA-z0-9][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$");
   }
}
