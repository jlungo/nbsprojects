import java.util.Scanner ;  // Import the Sanner class
public class UserName {
  public static void main (String[] args) {
    Scanner myObj = new Scanner (System. in) ; // Creat a Scanner object
    System.out.println ("Enter Username");
    String UserName = myObj.nextLine();    
    System.out.println ("UserName is :"  + UserName) ; // Output user input
  }
}