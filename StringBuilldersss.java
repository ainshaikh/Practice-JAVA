import java.util.*;
public class StringBuilldersss {
    public static void main(String[] args) {
        
        // strings builder are mutable

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0

        System.out.println(sb.charAt(0));

        //set char at index 0

        sb.setCharAt(0, 'P');  // always single qouted
        System.out.println(sb);

        // inserting characters

        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);


        //delete

        sb.delete(2,3);  // non inclusive index
        System.out.println(sb);

        //append---- to add in last

        sb.append("e");
        sb.append("l");
        System.out.println(sb);

        // reverse the word

        for(int i=0; i<sb.length()/2; i++){
            int front=i;
            int back =sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);




    }
}
