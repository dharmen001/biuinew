package JavaPolymorphism.MethodOverloadingInJava.MehtodOverLoadingChangingNoOfArguments;

public class Adder {

    public static void main(String[] args) {
        Add ad =new Add();

        ad.add(11,22);
        ad.add(22,33,34);
    }

}

class Add{

    void add(int a,int b){

        System.out.println(a+b);
    }

    void add(int a, int b, int c){

        System.out.println(a+b+c);
    }
}
