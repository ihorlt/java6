import mock.UserMock;
import models.User;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        User user = new User();

        Scanner input = new Scanner(System.in);
        String command = "login";
       while(true) {

           switch (command) {
               case "login":
                   System.out.println("Please log in");
                   String userName = input.nextLine();
                   System.out.println("Please, enter password");
                   String password = input.nextLine();
                   user.setUserName(userName);
                   user.setPassword(password);
                   UserMock userMock = new UserMock();
                   User userFound = userMock.checkUser(user);
                   if (userFound != null) {
                       System.out.println("Welcome " + userName);
                       if (userFound.getRole() == 1) {
                           System.out.println("Welcome admin");
                       }
                       if (userFound.getRole() == 0) {
                           System.out.println("Welcome user");
                       }
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
