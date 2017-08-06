package ThisKeyword;

public class ABC {

    public static void main(String[] args) {

        NewAbc na = new NewAbc();
    }
}

class NewAbc{

    int x = 10;

    NewAbc(){

        NewNewAbc nna = new NewNewAbc(this);
        nna.disp();



    }
}

class  NewNewAbc{

    NewAbc obj;

    NewNewAbc(NewAbc obj){

        this.obj=obj;

    }

    void  disp(){

        System.out.println(obj.x);
    }
}