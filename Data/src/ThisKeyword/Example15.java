package ThisKeyword;

//4) this: to pass as an argument in the method

//The this keyword can also be passed as an argument in the method.
//It is mainly used in the event handling.


public class Example15 {

    public static void main(String[] args) {

        S2 s1 = new S2();
        s1.p();
    }
}

class S2{

    void m(S2 obj){

        System.out.println("method is invoked");
    }

    void p(){


        m(this);
    }


}
