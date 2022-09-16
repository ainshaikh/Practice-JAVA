import java.util.Scanner;

public class Function {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }


    // public static int sum(int a, int b){
    //     int sum = a+b;
    //     System.out.println(sum);
    //     return sum;
    // }


    // public static int calculateProduct(int a, int b){
    //     return a * b;
    // }

        public static void printFactorial(int n){
            if(n<0){
                System.out.println("Invalid number");
                return;
            }
            int factorial = 1;
            for(int i=n; i>=1; i--){
                factorial = factorial * i;
            }

            System.out.println(factorial);
            return;
        }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // for factorial

        int n = scn.nextInt();

        printFactorial(n);





        // String name = scn.nextLine();
        // int a = scn.nextInt();
        // int b = scn.nextInt();

        // System.out.println("The product is :"+ calculateProduct(a,b));
        

        // printMyName(name);  // function is called
        // sum(a, b);

        //NOTE--->  a method is called inside a class and function is called directly in function
    }
}
