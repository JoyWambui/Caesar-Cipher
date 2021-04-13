package models;

public class Decoder {
    private String encryptedSentence;
    private int decryptionKey;
    public  Decoder(String encryptedSentence, int decryptionKey){
        this.encryptedSentence = encryptedSentence;
        this.decryptionKey = decryptionKey;
    }

    public String getEncryptedSentence() {
        return encryptedSentence;
    }

    public int getDecryptionKey() {
        return decryptionKey;
    }
    public String decode(String encryptedSentence, int decryptionKey){
        StringBuilder decodedStringBuilder = new StringBuilder();
        decryptionKey = 26- decryptionKey;
        for (int position = 0; position<encryptedSentence.length(); position++) {
            if(Character.isSpaceChar(encryptedSentence.charAt(position))){
                char characterPosition = (char) ((int)encryptedSentence.charAt(position));
                decodedStringBuilder.append(characterPosition);
            }else if(Character.isUpperCase(encryptedSentence.charAt(position))) {
                char characterPosition = (char) (((int)encryptedSentence.charAt(position)+decryptionKey-65)%26 -65);
                decodedStringBuilder.append(characterPosition);
            }else{
                char characterPosition = (char) (((int)encryptedSentence.charAt(position)+decryptionKey-97)%26 +97);
                decodedStringBuilder.append(characterPosition);
            }
        }

        return decodedStringBuilder.toString();
    }

}
