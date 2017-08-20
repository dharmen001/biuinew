package JavaPolymorphism.MethodOverloadingInJava.FinalKeyword;

//static blank final variable

//A static final variable that is not initialized at the time of
//declaration is known as static blank final variable. It can be initialized only in static block.

public class Ab {

    public static void main(String[] args) {

        System.out.println(Abc.data);
    }
}

class Abc{

    static final int data;

    static {data = 50;}
}