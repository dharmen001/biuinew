package JavaPolymorphism.MethodOverloadingInJava.MethodOverriding;

public class Test2 {

    public static void main(String[] args) {



       Sbi s = new Sbi();
       Icici i = new Icici();
       Axis a = new Axis();
       System.out.println("Sbi rate of intrest: "+s.getrateofintrest());
       System.out.println("Icici rate of intrest: "+i.getrateofintrest());
       System.out.println("Axis rate of intrest: "+a.getrateofintrest());


    }

}

class Bank{

    int getrateofintrest(){

        return 0;
    }
}

class Sbi extends Bank {

    int getrateofintrest(){
        return 8;
    }
}

class Icici extends Bank{

    int getrateofintrest()
    {

        return 9;
    }
}


class Axis extends Bank{

    int getrateofintrest()
    {

        return 10;
    }
}
