package models;

public class Decoder {
    private String encryptedSentence;
    public  Decoder(String encryptedSentence, int key){
    this.encryptedSentence = encryptedSentence;
    }

    public String getEncryptedSentence() {
        return encryptedSentence;
    }
}
