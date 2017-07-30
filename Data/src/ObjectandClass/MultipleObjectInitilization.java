package ObjectandClass;

class Bank{

    int atmId;
    String bankName;
}

public class MultipleObjectInitilization {

    public static void main(String[] args) {

        Bank b1=new Bank();
        Bank b2=new Bank();

        b1.atmId = 123;
        b2.atmId = 456;
        b1.bankName = "HDFC";
        b2.bankName = "SBI";

        System.out.println(b1.atmId+" "+b2.atmId);
        System.out.println(b1.bankName+" "+b2.bankName);

    }

}
