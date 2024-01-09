import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";

        int x=0;


       while (x <= 0) {
            System.out.println("Enter Name");
            String userInput = scanner.nextLine();
            System.out.println("Enter password");
            String userPassword = scanner.nextLine();
x++;
        }
    
    try {
         System.out.println("Enter username:");
        String userInput=scanner.nextLine();
        System.out.println("Enter password:");
        String userPassword = scanner.nextLine();

 if (userInput.equals(validUsername) && userPassword.equals(validPassword) ){

  System.out.println("Welcome to coded!"); }
  else { 
    throw new Exception("Invalid credentials");}}

    catch (Exception e){
        System.out.println("Invalid username and password , try again");
    }
    
    scanner.close();
   
    
    }}

