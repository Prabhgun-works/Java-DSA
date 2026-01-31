import java.util.*;

public class reversal {
    public static int Intvervse(int n){
        int rem = 0 ;
        return(n/10 , rem*10 + n%10);
    }

public static void main(String[ args]) {
    int n = 567;
    System.out.println(Intvervse(n));
}
}