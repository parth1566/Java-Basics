package fundamentals;

import java.util.*;

public class StringBuilderFunction {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("H");
        // System.out.println(sb);

        //char at index 0 
        //System.out.println(sb.charAt(0));

        //set charat index 0
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // sb.insert(0, 'S');
        // System.out.println(sb);

        // sb.insert(2, 'n');
        // System.out.println(sb);

        // delete the extra 'n'
        // sb.delete(2, 5);
        // System.out.println(sb);

        sb.append("e"); // str = str + "e";
        sb.append("l"); // str = str + "l"
        sb.append("l"); // str = str + "l"
        sb.append("o"); // str = str + "o"
        System.out.println(sb.length());
    }
}
