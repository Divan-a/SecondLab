package org.example;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StringProcessorTest {

    @Test
    public void testString() throws IllegalArgumentException{
        assertEquals("aaa", StringProcessor.stringCopy("a", 3));
    }

    @Test
    public void testString2() throws IllegalArgumentException{
        assertEquals("ababab", StringProcessor.stringCopy("ab", 3));
    }

    @Test
    public void testString3() throws IllegalArgumentException{
        assertEquals("", StringProcessor.stringCopy("ab", 0));
    }

    @Test
    public void testStringException() throws IllegalArgumentException{
        assertThrows(IllegalArgumentException.class, () -> StringProcessor.stringCopy("ab", -1));
    }

    @Test
    public void testSubString() throws ArithmeticException{
        assertEquals(1, StringProcessor.substringOccurence("ab", "ab"));
    }

    @Test
    public void testSubString2() throws ArithmeticException{
        assertEquals(3, StringProcessor.substringOccurence("abababghth", "ab"));
    }

    @Test
    public void testSubString3() throws ArithmeticException{
        assertEquals(0, StringProcessor.substringOccurence("", "ab"));
    }

    @Test
    public void testSubString4() throws ArithmeticException{
        assertEquals(3, StringProcessor.substringOccurence("abababbagba", "ab"));
    }

    @Test
    public void testStringExeption() throws ArithmeticException{
        assertThrows(ArithmeticException.class, () -> StringProcessor.substringOccurence("adfs", null) );
    }


    @Test
    public void testChangeNumInString(){
        assertEquals("одиндватри", StringProcessor.changeNumInString("123"));
    }
    @Test
    public void testChangeNumInString2(){
        assertEquals("три", StringProcessor.changeNumInString("3"));
    }

    @Test
    public void deleteEverSecondElemTest(){
        StringBuilder str = new StringBuilder("abcdefgh");
        Assertions.assertEquals("aceg", StringProcessor.deleteEverSecondElem(str).toString());
    }

}
