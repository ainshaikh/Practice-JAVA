public class PalindromicNumberPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                //print spaces
                System.out.print(" ");
            }
            // numbers first half
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                // 2nd half numbers
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
