import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String user = null;

        Scanner input = new Scanner(System.in);
        String command = "login";
       while(true) {

           switch (command) {
               case "login":
                   System.out.println("Please log in");
                   String userName = input.nextLine();
                   System.out.println("Please, enter password");
                   String password = input.nextLine();
                   if (userName.equalsIgnoreCase("Igor") &&
                           password.equals("1111")) {
                       System.out.println("Welcome " + userName);
                       user = userName;
                   } else {
                       System.out.println("Wrong log in");
                       command = "login";
                   }
                   command = "";
                   break;
               case "doit":
                   if (user != null) {
                       System.out.println("OK");
                   }
                   command = "";
                   break;
               case "logout":
                   System.out.println("Successfully logged out");
                   user = null;
                   command = "";
                   break;
               case "exit":
                   System.out.println("Bye Bye");
                   System.exit(1);
                   default:
                       if (user != null) {
                           System.out.println("Enter command");
                           command = input.nextLine();
                       } else {
                           System.out.println("You have not logged in");
                           command = "login";
                       }

           }

       }
    }
}
