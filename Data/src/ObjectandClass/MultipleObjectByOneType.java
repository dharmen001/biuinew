package ObjectandClass;

public class MultipleObjectByOneType {

    public static void main(String[] args) {

        Rectangle r1=new Rectangle(),r2 = new Rectangle();

        r1.insert(2,3);
        r2.insert(3,4);

        r1.calculateare();
        r2.calculateare();
    }


}

class Rectangle{

    int length;
    int width;

    void insert(int l,int w){

        length = l;
        width = w;
    }

    void calculateare(){
        System.out.println(length*width);
    }


}