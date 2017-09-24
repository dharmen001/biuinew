package String.StringBuilder;

import java.security.SecureRandom;

public class StringEqualTest {

    public static void main(String [] args){

        String s1 = "Aftab";
        String s2 = "HARSH";
        String s3 = "HARSH";
        String s4 = "Dharmendra";
        String s5 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));



    }
}
