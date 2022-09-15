public class SolidPattern {
    public static void main(String[] args) {
        // for(int i = 1; i<=4; i++){
        //     for(int j=1; j<=4; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }


        int n = 4;
        int m = 4;
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
