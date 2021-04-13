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
    @Test
    public void newDecoder_getsDecryptionKeyValue_3() {
        Decoder testDecoder = new Decoder("pb qdph", 3);
        assertEquals(3, testDecoder.getDecryptionKey());
    }
    @Test
    public void decode_decodeEncryptedSentence_String(){
        Decoder testDecoder = new Decoder("pb qdph", 3);
        String expectedOutput = "my name";
        String methodOutput = testDecoder.decode("pb qdph",3);
        assertEquals(expectedOutput,methodOutput);
    }




}