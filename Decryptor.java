public class Decryptor {

    public static String decrypt (String secretMessage, int shift){

        StringBuilder decryptedMessage = new StringBuilder();

        //Loops through each character in the secretMessage
        for (int i = 0; i < secretMessage.length(); i++){

            char c = secretMessage.charAt(i);

            //Checks to see if the character is a letter
            if (Character.isLetter(c)){
                //Shifts the character backwards from the shift value to decrypt it
                c = (char) ((c - 'a' - shift + 26) % 26 + 'a');
            }

            //Appends the decrypted letter to the result
            decryptedMessage.append(c);
        }

        //Returns the decrypted message
        return decryptedMessage.toString();
    }
    
}
