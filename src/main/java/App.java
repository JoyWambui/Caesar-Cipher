import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import models.*;

public class App {
    public static void main(String[]args)throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean runApplication = true;
        while (runApplication) {
            System.out.println("Welcome to the Caesar-Cipher Program!");
            System.out.println("Enter one option: Encrypt, Decrypt, Exit.");
            System.out.println("Option: ");

            String chosenOption = reader.readLine();
            if (chosenOption.equals("Encrypt")||chosenOption.equals("Decrypt")) {
                System.out.println("Enter Sentence : ");
                String inputSentence = reader.readLine();
                System.out.println(inputSentence);
                int key;
                do {
                    System.out.println("Enter Desired Key. Choose a number between 1 and 25 ");
                    String stringKey = reader.readLine();
                    key = Integer.parseInt(stringKey);
                } while ((key<1||key>25));

                System.out.println(key);
                if (chosenOption.equals("Encrypt")){
                    Encoder encryption = new Encoder(inputSentence,key);
                    String outputSentence = encryption.encode(inputSentence,key);
                    encryption.setInputSentence(inputSentence);
                    encryption.setKey(key);
                    encryption.setEncodedResult(outputSentence);
                    System.out.println(encryption.toString());
                }else{
                    Decoder decryption = new Decoder(inputSentence,key);
                    String outputSentence = decryption.decode(inputSentence,key);
                    decryption.setEncryptedSentence(inputSentence);
                    decryption.setDecryptionKey(key);
                    decryption.setDecryptedSentence(outputSentence);
                    System.out.println(decryption.toString());
                }

            } else if (chosenOption.equals("Exit")) {
                System.out.println("Goodbye!");
                runApplication=false;

            } else {
                System.out.println("Kindly choose one of the options!");
            }
        }
    }

}
