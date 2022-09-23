import java.io.*;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        
        // // int [] marks = new int [3];
        // int marks [] = {12,22,34};
        // // int  marks [] = new int [3];
        // // marks[0] = 80;
        // // marks[1] = 33;
        // // marks[2] = 40;
        

        // for(int i=0; i<3; i++){

       
        // System.out.println(marks[i]);
        // }


        Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();

            int [] numbers = new int [size];

            // input

            for(int i=0; i<size;i++){
                numbers[i] = sc.nextInt();
            }
            int x = sc.nextInt();

            // output

            for(int i=0; i<numbers.length; i++){
                if(numbers[i]==x){   // linear search algorithm that goes in straight fashion.
                    System.out.println("x found at index " + i);
                }
            }


    }
}
