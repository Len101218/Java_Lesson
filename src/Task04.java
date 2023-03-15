package src;

public class Task04 {

    public static long ggt(int a, int b) {
        if ( a==0 ) {
            return b;
        }
        if ( b==0 ) {
            return a;
        }
        if ( b<0) {
            b=-b;
        }
        if ( a<0){
            a=-a;
        }
        if (a >= b) {
            return ggt(a - b, b);
        } else {
            return ggt(a, b-a);
        }
    }

}
/*  -7, -39
a= -7, b= -14
c= -7-14= -21
if ( b<0) / if (a<0)
 -
 */