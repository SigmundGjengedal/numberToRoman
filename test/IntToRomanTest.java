import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntToRomanTest {

    @Test
    public void testNumbersUnder10(){

        assertEquals("I", IntToRoman.converter(1));
        assertEquals("II", IntToRoman.converter(2));
        assertEquals("III", IntToRoman.converter(3));
        assertEquals("IV", IntToRoman.converter(4));
        assertEquals("V", IntToRoman.converter(5));
        assertEquals("VI", IntToRoman.converter(6));
        assertEquals("VII", IntToRoman.converter(7));
        assertEquals("VIII", IntToRoman.converter(8));
        assertEquals("IX", IntToRoman.converter(9));

    }

    @Test
    public void testNumbersUnder100(){

        assertEquals("X", IntToRoman.converter(10));
        assertEquals("XXII", IntToRoman.converter(22));
        assertEquals("XC", IntToRoman.converter(90));


    }
}
