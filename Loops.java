import java.util.*;
public class Loops{
    public static void main(String[] args) {
        // for loops--
        // for(int i = 0; i< 11; i++){
        //     System.out.print(i+" ");
        // }


        // While loops--
            // int i =0;
            // while(i<11){
            //     System.out.println(i);
            //     i++;
            // }

            // do-while loops--

            // int i = 0;
            // do{
            //     System.out.print(i+" ");
            //     i++;
            // }
            // while(i<100);

            // print the sum of n numbers

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            // int sum = 0;
            // for(int i =1; i<=n; i++){
            //     sum = sum + i;
            // }
            // System.out.println(sum);

            for(int i =1; i<11; i++){
                System.out.print(n*i+" ");
            }
    }
    
}