package StaticKeyword;

public class WithOutStatic {

    public static void main(String[] args) {

        TestWithoutStatic tws1 = new TestWithoutStatic();
        TestWithoutStatic tws2 = new TestWithoutStatic();
        TestWithoutStatic tws3 = new TestWithoutStatic();
    }
}

class TestWithoutStatic{

    int count = 0;
    TestWithoutStatic(){

        count++;
        System.out.println(count);
    }
}