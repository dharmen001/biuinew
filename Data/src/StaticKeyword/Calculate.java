package StaticKeyword;

public class Calculate {

    public static void main(String[] args) {
        TestCalculate tc1 = new TestCalculate();
        int result  = tc1.cube(5);
        System.out.println(result);
    }

}

class TestCalculate
{

    static int cube(int x)
    {
    return x*x*x ;
    }

}
