package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EncoderTest {
    @Test
    public void newEncoder_correctInstantiation() {
        Encoder sampleEncoder = new Encoder("my name", 3, "pb qdph");
        assertTrue(sampleEncoder instanceof Encoder);
    }


}