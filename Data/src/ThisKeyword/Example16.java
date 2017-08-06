package ThisKeyword;

public class Example16 {

    public static void main(String[] args) {


        TestExample16 te16=new TestExample16();

        te16.newadd();
    }
}


class TestExample16{

    void add(TestExample16 te16){

        System.out.println("Method is invoked");
    }

    void newadd(){

        add(this);
    }
}