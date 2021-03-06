package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncoderTest {
    @Test
    public void newEncoder_correctInstantiation() {
        Encoder sampleEncoder = new Encoder("my name", 3);
        assertTrue(sampleEncoder instanceof Encoder);
    }
    @Test
    public void newEncoder_getsStringInputSentence_myName() {
        Encoder sampleEncoder = new Encoder("my name", 3);
        assertEquals("my name", sampleEncoder.getInputSentence());
    }
    @Test
    public void newEncoder_getsKeyValue_3() {
        Encoder sampleEncoder = new Encoder("my Name", 3);
        assertEquals(3, sampleEncoder.getKey());
    }



}