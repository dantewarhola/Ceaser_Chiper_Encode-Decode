public class Encryptor {

    public static String encrypt (String secretMessage, int shift){

        StringBuilder encryptedMessage = new StringBuilder();

        //Converts the secret message to lowecase
        secretMessage = secretMessage.toLowerCase();


        //Loop through each character in the secretMessage
        for (int i = 0; i < secretMessage.length(); i++){
            char c = secretMessage.charAt(i);

            //Checks to see if the character is a letter
            if (Character.isLetter(c)){
                //Shifts the character forward by the shift value to encrypt it
                c = (char) ((c - 'a' + shift + 26) % 26 + 'a');
            }

            //Appends the character to the result
            encryptedMessage.append(c);
        }

        //Returns the fully encrypted message
        return encryptedMessage.toString();
    }
    
}
