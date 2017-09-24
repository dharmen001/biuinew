package String.StringBuilder;

public class StringEqualIgnore {

    public static void main(String [] args){

        String s1 = "java";
        String s2 = "JAVA";
        String s3 = new String( "java");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));


    }
}
