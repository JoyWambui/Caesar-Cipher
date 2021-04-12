package models;

public class Encoder {
    private String inputSentence;
    private int key;
    public  Encoder(String inputSentence, int key, String encodedResult){
        this.inputSentence = inputSentence;
        this.key = key;
    }

    public String getInputSentence() {
        return inputSentence;
    }

    public int getKey() {
        return key;
    }
}
