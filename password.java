import java.util.regex.*;
public class password {
   public static void main( String[] args ) {
      System.out.println(password("1mA#m@adhu"));

   }

   public static boolean password( String password ) {
return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]){1}.{8,}$");

   }
}
