package models;

public class Encoder {
    private String inputSentence;
    private int key;
    private String encodedResult;
    public  Encoder(String inputSentence, int key, String encodedResult){
        this.inputSentence = inputSentence;
        this.key = key;
        this.encodedResult = encodedResult;
    }

    public String getInputSentence() {
        return inputSentence;
    }

    public int getKey() {
        return key;
    }

    public String getEncodedResult() {
        return encodedResult;
    }
}
