package Tests;

import org.junit.jupiter.api.Test;
import src.Task03;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_task03 {
    //Task: write a funtcion "fakultaet" that implements the faculty function:
    /*
    fakultaet(2) = 2
    fakultaet(3) = 6
    fakultaet(4) = 24
    fakultaet(5) = 120
     */
    @Test
    public void Test_first_15_numbers(){
        long[] results = new long[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800l, 87178291200l, 1307674368000l, 20922789888000l, 355687428096000l, 6402373705728000l, 121645100408832000l};
        for(int i = 0;i<results.length; i++){
            assertEquals(results[i], Task03.fakultaet(i));
        }
    }
    @Test
    public void Test_edge_case(){
        assertDoesNotThrow(() ->{Task03.fakultaet(-1);});
    }

}
