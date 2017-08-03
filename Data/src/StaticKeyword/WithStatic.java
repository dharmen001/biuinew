package StaticKeyword;

public class WithStatic
{

    public static void main(String[] args) {

        TestWithStatic tws1 = new TestWithStatic();
        TestWithStatic tws2 = new TestWithStatic();
        TestWithStatic tws3 = new TestWithStatic();


    }

}
class TestWithStatic{

    static int count = 0;

    TestWithStatic(){

        count++;

        System.out.println(count);

    }
}