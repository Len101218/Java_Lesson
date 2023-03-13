import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class Tests_task02 {
    //TASK:
    /*
    Write a method "fibonacci" that gives the n-th Fibonacci number :
    Fibonacci(0) = 1
    Fibonacci(1) = 1
    Fibonacci(2) = 2
    Fibonacci(3) = 3
    Fibonacci(4) = 5
    Fibonacci(5) = 8
    .
    .
    .
    */

    //Difficulty: hard

    @Test
    public void Test_first_30_numbers(){
        int[] results = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040};
        for(int i = 0;i<30; i++){
            assertEquals(results[i],Main.fibonacci(i));
        }
    }

    @Test
    public void Test_edge_case(){
        assertDoesNotThrow(() ->{Main.fibonacci(-1);});
    }

    @Test
    public void Test_edge_case_big_input(){
        assertEquals(2971215073L,Main.fibonacci(46));
    }
}
