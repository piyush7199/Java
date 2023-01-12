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


    public static void main(String[] args) {
        // printSquare(5);
        // printTriangle(5);
        printNumberTriangle(5);
    }
}