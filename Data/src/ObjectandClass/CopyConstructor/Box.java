package ObjectandClass.CopyConstructor;

public class Box {

    public static void main(String[] args)
    {

        TestBox tb1 = new TestBox(1,2,4);
        TestBox tb2 = new TestBox(tb1);

        tb1.display();
        tb2.display();

    }

}


class TestBox{

    double height;
    double lenght;
    double width;

    TestBox(double h,double l,double w)
    {
        height = h;
        lenght= l;
        width = w;
    }

    TestBox (TestBox tb)
    {

    height = tb.height;
    lenght = tb.lenght;
    width = tb.width;

    }

    void display()
    {

         double  volume = lenght*width*height;
        System.out.println(volume);
    }

}