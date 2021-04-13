package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoderTest {
    @Test
    public void newDecoder_correctInstantiation() {
        Decoder testDecoder = new Decoder("pb qdph", 3);
        assertTrue(testDecoder instanceof Decoder);
    }

}