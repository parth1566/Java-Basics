package fundamentals;

import java.sql.Struct;
import java.util.*;

public class Strings {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is : "+ name);

        //                //CONCATENATION
        // String firstName = "Parth";
        // String lastName = "Sharma";
        // String fullName = firstName + "@" + lastName;
        // System.out.println(fullName.length());

        //                 //charAt
        // for(int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

                          //Compare strings
        // String name1 = "Parth";
        // String name2 = "Parth2";

        //Case 1 -> s1 > s2 : +ve value
        //Case 2 -> s1 == s2 : 0
        //Case 3 -> s1 < s2 : -ve value

        // if(name1.compareTo(name2)== 0) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(name1 == name2) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // if(new String("Parth") == new String("Parth")) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

                            //SubString
        String sentence = "My name is Parth";
        //substring(beg index, end index)
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        //Strings are immutable
    }
}
