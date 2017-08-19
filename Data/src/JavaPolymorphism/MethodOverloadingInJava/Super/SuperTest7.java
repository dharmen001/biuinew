package JavaPolymorphism.MethodOverloadingInJava.Super;

public class SuperTest7 {

    public static void main(String[] args) {

        Sbi sb1 = new Sbi(123,"Dharmendra","Dhar");
        sb1.display();
    }
}

class Bank{

    int AccountNumber;
    String name;
    static String Bankname = "SBI";

    Bank(int AccountNumber,String name){

        this.AccountNumber = AccountNumber;
        this.name = name;
    }
}

class Sbi extends Bank{

    String AcName;

    Sbi(int AccountNumber,String name,String AcName){

        super(AccountNumber,name);
        this.AcName = AcName;

    }
    void display(){

        System.out.println(AccountNumber+" "+name+" "+AcName+" "+Bankname);
    }

}