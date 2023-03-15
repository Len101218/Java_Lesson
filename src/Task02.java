package src;

public class Task02 {
    public static long fibonacci (int n) {
       if (n>=2) {
           return fibonacci(n-2)+ fibonacci(n-1);
       }
       else{
           return 1;
       }
    }
}

