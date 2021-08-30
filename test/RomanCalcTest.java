import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanCalcTest {

    @Test
    public void shouldConvert1toI(){
        assertEquals(RomanCalc.toRoman(1),"I");

    }

    @Test
    public void shouldConvert2toII(){
        assertEquals("II", RomanCalc.toRoman(2)) ;
    }

    @Test
    public void shouldConvert3toIII(){
        assertEquals("III", RomanCalc.toRoman(3)) ;
    }


    @Test
    public void shouldConvert5tooV(){
        assertEquals(RomanCalc.toRoman(5),"V");

    }

    @Test
    public void shouldConvert10toX(){
        assertEquals(RomanCalc.toRoman(10),"X");

    }




}
