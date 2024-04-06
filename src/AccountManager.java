import java.util.Scanner;

public class AccountManager {
    public static void main(String[] args) {
        System.out.println("Hello world!");



       Scanner userInput = new Scanner(System.in);







       while(true){


           System.out.println("1. Create User Profile");
           System.out.println("2. Create User Bio");
           System.out.println("3. Show Profile Details");
           System.out.println("4. Exit");
           System.out.println("Enter your choice");

           int choice = userInput.nextInt();

           userInput.nextLine();



           switch(choice){

               case 1:
                   System.out.println("We are in option 1");

               case 2:
                   System.out.println("We are in option 2");

               case 3:
                   System.out.println("We are in option 3");

               case 4:
                   System.out.println("We are in option 4");

               default:
                   System.out.println("Invalid Choice. Try Again");

           }

       }

    }
}