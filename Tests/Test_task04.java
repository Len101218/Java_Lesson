package Tests;

import org.junit.jupiter.api.Test;
import src.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_task04 {//noch mehr Rekursion
    //task: implement a recursive function "ggt" that calculates with the euclidean algorithm the greatest common divisor (deutsch: grössten gemeinsamen Teiler)
    /*
    ggt(3,6) = 3
    ggt(12,16) = 4
    ggt(4,6) = 2
    ggt(18,27)  = 9

    ggt(16,12) = ggt(4,12) = ggt(4,8) = ggt(4,4) = ggt(4,0) =

    euclidean algorithm:
    if a>b:  ggt(a,b) = ggt(a-b,b)
    if b>a:  ggt(a,b) = ggt(a,b-a)
    and
    ggt(0,b) = ggt(b,0) = b
     */

    @Test
    public void small_test(){
        int[][] tests = new int[][]{{3,6},{12,16},{4,6},{18,27}};
        int[] result = new int[]{3,4,2,9};
        for(int i =0; i<tests.length;i++)
            assertEquals(Task04.ggt(tests[i][0],tests[i][1]),result[i]);
    }

    @Test
    public void big_test(){
        int[][] tests = new int[100][2];
        Random gen = new Random(0);
        for (int i = 0; i<100;i++)
            tests[i]= new int[]{gen.nextInt(), gen.nextInt()};
        int[] result = new int[]{248, 2, 2, 1, 1, 5, 1, 1, 1, 1, 9, 2, 8, 1, 1, 1, 25, 4, 7, 1, 1, 2, 26, 4, 4, 1, 1, 2, 1, 17, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 3, 2, 1, 10, 12, 1, 3, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 6, 1, 5, 4, 4, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 3, 1, 1, 11, 3, 1, 1, 1, 1, 1, 1, 1, 2, 6, 3, 2, 2, 3, 5, 2, 2, 4, 9,};
        for(int i =0; i<tests.length;i++)
            assertEquals(result[i],Task04.ggt(tests[i][0],tests[i][1]));
    }
}
