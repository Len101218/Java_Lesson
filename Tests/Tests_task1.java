package Tests;

import org.junit.jupiter.api.*;
import src.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests_task1 {

    @Test
    public void test_odd(){
        Random gen = new Random(0);
        for (int i = 0; i<1000;i++)
            assertEquals(Main.decideNumber((gen.nextInt()*2 + 1)),"odd");
    }
    @Test
    public void test_even(){
        Random gen = new Random(1);
        for (int i = 0; i<1000;i++)
            assertEquals(Main.decideNumber((gen.nextInt()*2 )),"even");
    }
}

