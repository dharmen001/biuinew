package ThisKeyword;

public class Student12 {

    public static void main(String[] args) {

        TestStudent12 ts12 = new TestStudent12();

        ts12.info();
    }

}


class TestStudent12{



    void disp(){

        System.out.println("Disp call");
    }

    void info(){

        System.out.println("infocall");
        this.disp();
    }


}

