package src;

public class Task03 {


    public static long fakultaet(int n) {
        if (n >= 2) {
            return n * fakultaet(n - 1);
        } else {
            return 1;
        }
    }
}
//fakultät n= 1 bis (n-1)
//fakultät(n)= n * fakultät(n-1)