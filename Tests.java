import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public static void test_odd(){
        Random gen = new Random(0);
        for (int i = 0; i<1000;i++)
            assertEquals(Main.decide_number((gen.nextInt()*2 + 1)),"odd");
    }
    @Test
    public static void test_even(){
        Random gen = new Random(1);
        for (int i = 0; i<1000;i++)
            assertEquals(Main.decide_number((gen.nextInt()*2 + 1)),"even");
    }
}

