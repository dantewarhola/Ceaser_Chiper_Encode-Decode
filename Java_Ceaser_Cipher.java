// Created by Dante Warhola

// This is my first official programming project that is going up on my GitHub.
// I chose to learn how to make a ceaser cipher shift because of my love of codes and puzzles.
// Created 9/6/24


import java.util.Scanner;

public class Java_Ceaser_Cipher {


    public static void main(String[] args) {
        
        //Created scanner to take user input
        Scanner scanner = new Scanner(System.in);

        //Takes the user input stroed as a string and makes it into secretMessage
        System.out.print("Please enter the message that you wanted encoded: ");
        String secretMessage = scanner.nextLine();

        //Also takes user input stored as a int and makes it into shift
        System.out.print("What number shift would you like to use?: ");
        int shift = scanner.nextInt();




        //Uses the Encryptor class to shift the secretMessage and prints it
        String encryptedMessage = Encryptor.encrypt(secretMessage, shift);
        System.out.println("Your encrypted message is: " + encryptedMessage);


        //Uses the Decryptor class to shift the encryptedMessage and prints it
        String decryptedMessage = Decryptor.decrypt(encryptedMessage, shift);
        System.out.println ("Your decrypted message is: " + decryptedMessage);
    }

}
