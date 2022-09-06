package HW5;

import static HW5.Main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHW5 {

    @Test
    void testGetBiggest(){
        int[] arr1 = {1, 2, 3, 4};
        assertEquals(getBiggest(arr1), 4);
        int[] arr2 = {-1, -2, -3, -4};
        assertEquals(getBiggest(arr2), -1);
    }

    @Test
    void testGetSumPositive(){
        int[] arr3 = {1, 2, 3, 4};
        assertEquals(getSumPositive(arr3), 10);
        int[] arr4 = {-1, -2, -3, -4};
        assertEquals(getSumPositive(arr4), 0);
    }

    @Test
    void testGetAmountNegative(){
        int[] arr5 = {1, 2, 3, 4};
        assertEquals(getAmountNegative(arr5), 0);
        int[] arr6 = {-1, -2, -3, -4};
        assertEquals(getAmountNegative(arr6), 4);
    }
}
