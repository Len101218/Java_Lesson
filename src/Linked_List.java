package src;

public class Linked_List {

    private Linked_List next;
    private int number;



    Linked_List (int a) {
        next=null;
        number=a;
    }


    public void add(int a){
       next= new Linked_List(a);

    }
    public void setNumber(int a){
        number=a;

    }
    public int getNumber(){
        return number;
    }


    public Linked_List getNext() {
        return next;
    }


    //TODO: find the 'element' in the linked list 'start'
    public static int find_index(Linked_List start, int element){

    }

    //TODO: add the 'element' in the linked list 'start' at the end
    public static void add(Linked_List start, int element){

    }

    //TODO: remove the 'element' in the linked list 'start'
    public static void remove(Linked_List start, int element){

    }


    //TODO: return the last element in the linked list 'start'
    public static insert_something_here getLast(Linked_List start){

    }


    //TODO: remove all after 'element' in the linked list 'start' ('element' will be the new last element)
    public static insert_something_here removeAfter(Linked_List start, int element){

    }
}
