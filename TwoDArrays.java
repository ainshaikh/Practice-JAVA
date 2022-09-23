import java.io.*;
import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int column = sc.nextInt();

          // 2d array declaration
          int matrices [] [] = new int [rows][column];

        for(int i=0; i<matrices.length; i++){
            for(int j=0; j<matrices[0].length; j++){
                matrices[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for(int i=0; i<matrices.length; i++){
            for(int j=0; j<matrices[0].length; j++){

                if(matrices[i][j]==x){
                    System.out.print("(" +i +","+j+")");
                }
               
            }
            // System.out.println();
        }
      


    }
}
