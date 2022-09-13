package HW6;

import static HW6.myCollection.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHW6 {

    @Test
    void testGetThanNum(){
        List<Integer> arrTest = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++){
            arrTest.add(i+1);
        }
        List<Integer> arrRes = new ArrayList<Integer>();
        for (int i = 2; i < 5; i++){
            arrRes.add(i);
        }
        assertEquals(getThanNum(arrTest, 2), arrRes);
    }

    @Test
    void testDelThanNum(){
        List<Integer> arrTest = new ArrayList<Integer>();
        for (int i = 18; i < 23; i++){
            arrTest.add(i);
        }
        List<Integer> arrRes = new ArrayList<Integer>();
        for (int i = 18; i < 21; i++){
            arrRes.add(i);
        }
        assertEquals(delThanNum(arrTest, 20), arrRes);
    }

    @Test
    void testPutNumByIndex(){
        List<Integer> arrTest = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++){
            arrTest.add(i+1);
        }
        List<Integer> arrRes = new ArrayList<Integer>();
        arrRes.addAll(Arrays.asList(1, 2, 111, 3, 4, 5));
        assertEquals(putNumByIndex(arrTest, 2, 111), arrRes);
    }



}
