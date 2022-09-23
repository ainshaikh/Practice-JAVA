import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
    //     String name = sc.nextLine();
    //     System.out.println("Your name is " + name);
    // }


    //concatrenation

    // String firstName = "Tony";
    // String lastName = " Stark";
    // String FullName = firstName + lastName;
    // System.out.println(FullName);
    // System.out.println(FullName.length());

    // // charAt method --> returns characters

    // for(int i=0; i<FullName.length(); i++){
    //     System.out.println(FullName.charAt(i));
    // }

                //COMPARE TWO STRINGS

        // String name1 = "Ain";
        // String name2 = "Shaikh";

        // //if s1>s2 == +ve
        // // if s1==s2-- 0
        // // s1<s2  == -ve

        // if(name1.compareTo(name2)==0){
        //     System.out.println("Both are equal");
        // }
        // else{
        //     System.out.println("Not equal");
        // }


            // Substrings----> substring(begidx, lastidx);

        String sentence = "My name is Ain Shaikh";
        String name = sentence.substring(14,sentence.length());

        System.out.println(name);

            // NOTE
        // Strings are immutable----> cannot be changed, delete, add , modify



    }   

}