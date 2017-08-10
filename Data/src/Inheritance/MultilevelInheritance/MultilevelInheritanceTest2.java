package Inheritance.MultilevelInheritance;
//This is for Herarical Class
public class MultilevelInheritanceTest2 {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        rec.Set_value(10,20);
        tri.Set_value(30,10);
        System.out.println("Area of rectangle = "+rec.area());
        System.out.println("Area of rectangle = "+tri.area());

    }
}

class Polygon{

    protected int height;
    protected int widhth;

    public void Set_value(int height,int widhth){

        this.height = height;
        this.widhth = widhth;
    }
}

class Rectangle extends Polygon{

    public double area(){

        return (height*widhth);

    }

}

class Triangle extends Polygon{

    public double area(){

        return (height*widhth)/2;
    }

}


