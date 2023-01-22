package practice.recursion;

public class Recursion {

    static public void printNos(int N)
    {
        if(N == 0){
            return;
        }else{
            printNos(N-1);
            System.out.print(N+" ");
        }
    }

    public static void printGfg(int N) {
        if(N == 0){
            return;
        }
        printGfg(N-1);
        System.out.print("GFG"+" ");
    }

    public static void printRevNos(int N) {
        if(N == 0){
            return;
        }
        System.out.print(N+" ");
        printNos(N-1);
    }

    public static void main(String[] args) {
        // printNos(10);
        // printGfg(10);
        // printRevNos(10);
    }
}
