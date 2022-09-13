package HW7;


import static HW7.HomeWork7.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHW7 {

    @Test
    void testGetMaxLengthName() {
        List<String> arrTest = new ArrayList<String>();
        arrTest.add("Bear");
        arrTest.add("Gold");
        arrTest.add("GoogleMap");
        HomeWork7 testHomeWorkClass = new HomeWork7();
        String result = testHomeWorkClass.getMaxLengthName(arrTest);
        assertEquals(result, "GoogleMap");
    }

    @Test
    void testGetSecondReversWord() {
        List<String> arrTest = new ArrayList<String>();
        arrTest.add("Bear");
        arrTest.add("Gold");
        arrTest.add("GoogleMap");
        HomeWork7 testHomeWorkClass = new HomeWork7();
        String result = testHomeWorkClass.getSecondReversWord(arrTest);
        assertEquals(result, "Gold");
    }

    @Test
    void testDelDoubleSpace() {
        String res = "i am test for my Home Work!";
        String s = "i    am  test  for    my  Home   Work!";
        HomeWork7 testHomeWorkClass = new HomeWork7();
        String result = testHomeWorkClass.delDoubleSpace(s);
        assertEquals(result, res);
    }
}
