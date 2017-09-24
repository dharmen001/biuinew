package String.StringBuilder;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class CompareToExample {

    public static void main(String[] args) {

        String s1 = "Dharmendra";
        String s2 = "Dharmendra";
        String s3 = "new";
        String s4 = new String("Java");
        String s5 = "hello";
        String s6 = "";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.compareTo(s6));


          }

}
