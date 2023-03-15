package src;

public class Main {

    public static void main(String[] args) {
        //int result = add_all_numbers(200);
        //System.out.println("Ergebnis: " + result);
        //find_primes(20);
       // int[] test= {1,3,2,5,3,5,3,2,1,5,1323,13,231,3,0,-2,-432,8,20,1};
        //insertionSort(test);
        //for(int i=0; i<test.length; i++){
         //   System.out.println(test[i]);
            String res = decideNumber(10);
            System.out.println(res);
        }


    //Add all numbers from 1 to n
    static int add_all_numbers(int n){
        int res = 0;
        for(int i =0;i<n;i++){
            res = res +i;
        }
        return res;
    }

    static void find_primes(int n){
        for ( int i=2; i<=n; i++){//finde alle primzahlen
            boolean is_prim = true;
            for (int j = 2;j<i; j++) {//teste ob i eine primzahl ist
                if(i%j==0){//i durch j teilbar
                    is_prim = false;
                }
            }
            if(is_prim){
                System.out.println(i);
            }
        }
    }

    static void insertionSort (int[] array) {
        for (int i=0; i<array.length; i++){
            for (int j=i; j>0; j-- ){
                if ( array[j]<array[j-1]){
                    int tmp= array[j];
                    array[j] = array[j-1];
                    array[j-1]= tmp;
                }
            }
        }
    }
    public static String decideNumber(int n) {
            boolean isGer = false;
        if (n%2==0){
            isGer=true;
            return "even";
        }
        else{
            return "odd";
        }
    }
}

//siehst du diesen Kommentar?
//

