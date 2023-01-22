package practice.mis;
import java.util.*;
public class Mis {

    public static ArrayList<Long> factorialNumbers(long N){
        ArrayList<Long> res = new ArrayList();
        long count = 1l;
        long j = 1l;
        while(j*count<=N){
            res.add(j*count);
            count = j*count;
            j++;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
