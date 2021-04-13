import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[]args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean runApplication = true;
        while (runApplication) {
            System.out.println("Welcome to the Caesar-Cipher Program!");
            System.out.println("Enter one option: Encrypt, Decrypt, Exit.");
            System.out.println(":");

            String chosenOption = reader.readLine();
            if (chosenOption.equals("Encrypt")) {
                System.out.println("Enter Sentence to be encrypted: ");

            } else if (chosenOption.equals("Decrypt")) {
                System.out.println("Enter Sentence to be decrypted: ");

            } else if (chosenOption.equals("Exit")) {
                System.out.println("Goodbye!");
                runApplication=false;

            } else {
                System.out.println("Kindly choose one of the options!");
            }
        }
    }

}
