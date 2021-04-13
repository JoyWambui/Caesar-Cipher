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
}
