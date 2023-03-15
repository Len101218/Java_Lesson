package Tests;

import org.junit.jupiter.api.Test;
import src.Linked_List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_task05 {
    //create a linked List and all its methods in the class Linked_List: use the already implemented skeletton
    @Test
    public void konstruktorTest(){
        Linked_List list  = new Linked_List(0);
    }
    @Test
    public void getterAndSetterTest(){
        Linked_List list  = new Linked_List(18);
        assertEquals(null,list.getNext());
        assertEquals(18,list.getNumber());
        list.setNumber(21);
        assertEquals(21,list.getNumber());
    }

    @Test
    public void addAndNextTest(){
        Linked_List list  = new Linked_List(18);
        int[] values = new int[]{1,3,5,7,9,8,6,4,2,0};
        for(int i : values){
            list.add(i);
            list = list.getNext();
            assertEquals(list.getNumber(),i);
        }
        assertEquals(list.getNext(),null);
    }

    @Test
    public void getAndsetNumberTest() {
        Linked_List list = new Linked_List(18);
        assertEquals(18,list.getNumber());
        list.setNumber(5);
        assertEquals(5,list.getNumber());
    }

}
