package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoderTest {
    @Test
    public void newDecoder_correctInstantiation() {
        Decoder testDecoder = new Decoder("pb qdph", 3);
        assertTrue(testDecoder instanceof Decoder);
    }
    @Test
    public void newDecoder_getsStringEncryptedSentence_pbQdph() {
        Decoder testDecoder = new Decoder("pb qdph", 3);
        assertEquals("pb qdph", testDecoder.getEncryptedSentence());
    }


}