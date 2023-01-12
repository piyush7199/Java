package patterns;

public class Patterns{
    /*
     
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * *   

    */
    public static void printSquare(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

     *
     * *
     * * *
     * * * *
     * * * * *

     */
    public static void printTriangle(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     */
    public static void printNumberTriangle(int n) {
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*

     * * * * *
     * * * *
     * * *
     * *
     *

     */
    public static void printReverseTriangle(int n) {
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printReverseNumberTriangle(int n) {
        for(int i = n;i>0;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

     */
    public static void printCountTriangle(int n){
        char count = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    /*

    A
    AB
    ABC
    ABCD
    ABCDE

     */
    public static void printAlphaTriangle(int n){
        for(int i = 0;i<n;i++){
            char count = 'A';
            for(int j = 0;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    /*

    ABCDE
    ABCD
    ABC
    AB
    A

     */
    public static void printAlphaReverseTriangle(int n){
        for(int i = 0;i<n;i++){
            char count = 'A';
            for(int j = i;j<n;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    /*

    A
    BB
    CCC
    DDDD
    EEEEE

     */
    public static void printAlphaSameTriangle(int n){
        char count = 'A';
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
    }

    /*

     ****
     *  *
     *  *
     ****

     */
    public static void printEmptySquare(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // printSquare(5);
        // printTriangle(5);
        // printNumberTriangle(5);
        // printReverseTriangle(5);
        // printReverseNumberTriangle(5); TODO
        // printCountTriangle(5);
        // printAlphaTriangle(5);
        // printAlphaReverseTriangle(5);
        // printAlphaSameTriangle(5);
        printEmptySquare(4);
    }
}