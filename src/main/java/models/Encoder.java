package models;

public class Encoder {
    private String inputSentence;
    public  Encoder(String inputSentence, int key, String encodedResult){
        this.inputSentence = inputSentence;
    }

    public String getInputSentence() {
        return inputSentence;
    }
}
