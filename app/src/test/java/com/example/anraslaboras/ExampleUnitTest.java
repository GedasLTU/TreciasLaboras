package com.example.anraslaboras;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void tuscias_tekstas_getCharsCount() {
        String givenstring = "";
        int expectValue = 0;
        int actualValue = Skaiciavimokodas.getCharsCount(givenstring);
        assertEquals(expectValue, actualValue);
    }
    @Test
    public void tuscias_tekstas_getWordsCount() {
        Skaiciavimokodas tc = new Skaiciavimokodas();
        String givenstring = "";
        int expectValue= 0;
        int actualValue = Skaiciavimokodas.getWordsCount(givenstring);
        assertEquals(expectValue, actualValue);
    }
    @Test
    public void tik_tarpai_getCharsCount() {
        String givenstring = "   ";
        int expectValue = 0; // Tik tarpai, todėl 0 žodžių tikimasi
        int actualValue = Skaiciavimokodas.getCharsCount(givenstring);
        assertEquals(expectValue, actualValue);
    }
    @Test
    public void tik_tarpai_getWordsCount() {
        Skaiciavimokodas tc = new Skaiciavimokodas();
        String givenstring = "   ";
        int expectValue = 0; // Tik tarpai, todėl 0 žodžių tikimasi
        int actualValue = Skaiciavimokodas.getWordsCount(givenstring);
        assertEquals(expectValue, actualValue);
    }
    @Test
    public void skirtuku_tikrinimas_getCharsCount() {
        String givenstring = "::: :: ;; ;;;";
        int expectValue = 10;
        int actualValue = Skaiciavimokodas.getCharsCount(givenstring);
        assertEquals(expectValue, actualValue);
    }
    @Test
    public void skirtuku_tikrinimas_getWordsCount() {
        Skaiciavimokodas tc = new Skaiciavimokodas();
        String givenstring = "::: :: ;; ;;;";
        int expectValue = 0;
        int actualValue = Skaiciavimokodas.getWordsCount(givenstring);
        assertEquals(expectValue, actualValue);
    }
    @Test
    public void simboliu_eilute_getCharsCount() {
        String givenstring = "1234";
        int expectValue = 4;
        int actualValue = Skaiciavimokodas.getCharsCount(givenstring);
        assertEquals(expectValue, actualValue);
    }
    @Test
    public void zodziu_eilute_getWordsCount() {
        Skaiciavimokodas tc = new Skaiciavimokodas();
        String givenstring = "Sveiki gyvi";
        int expectValue = 2;
        int actualValue = Skaiciavimokodas.getWordsCount(givenstring);
        assertEquals(expectValue, actualValue);
    }


}