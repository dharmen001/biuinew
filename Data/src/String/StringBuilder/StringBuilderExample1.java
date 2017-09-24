package String.StringBuilder;

public class StringBuilderExample1 {

public static void main(String [] args){

    StringBuilder sb = new StringBuilder("Java");
    sb.append("hello");
    System.out.println(sb);
    sb.insert(1,"Dharmendra");
    System.out.println(sb);
    sb.replace(1,3,"Yahoo");
    System.out.println(sb);
    sb.delete(1,6);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.capacity();
    System.out.println(sb);
    sb.append("Royal");
    System.out.println(sb);
    sb.capacity();
    System.out.println(sb);
}

}
