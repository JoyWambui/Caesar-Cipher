package models;



public class Encoder {
    private String inputSentence;
    private int key;
    private String encodedResult;
    public  Encoder(String inputSentence, int key){
        this.inputSentence = inputSentence;
        this.key = key;
    }

    public String getInputSentence() {

        return inputSentence;
    }

    public void setInputSentence(String inputSentence) {
        this.inputSentence = inputSentence;
    }

    public int getKey() {

        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getEncodedResult() {
        return encodedResult;
    }

    public void setEncodedResult(String encodedResult) {
        this.encodedResult = encodedResult;
    }

    @Override
    public String toString() {
        return "Encoder[\n" +
                "Input Sentence= " + getInputSentence() + "\n" +
                "Key= " + getKey() + "\n" +
                "Encrypted Sentence= " + getEncodedResult() + "\n" +
                "]";
    }

    public String encode(String inputSentence, int key){
        StringBuilder encodedStringBuilder = new StringBuilder();
        for (int index = 0; index <inputSentence.length(); index++) {
            if(Character.isSpaceChar(inputSentence.charAt(index))){
                char characterPosition = (char) ((int)inputSentence.charAt(index));
                encodedStringBuilder.append(characterPosition);
            }else if(Character.isUpperCase(inputSentence.charAt(index))) {
                char characterPosition = (char) (((int)inputSentence.charAt(index)+key-65)%26 +65);
                encodedStringBuilder.append(characterPosition);
            }else{
                char characterPosition = (char) (((int)inputSentence.charAt(index)+key-97)%26 +97);
                encodedStringBuilder.append(characterPosition);
            }
        }

        return encodedStringBuilder.toString();
    }


}
