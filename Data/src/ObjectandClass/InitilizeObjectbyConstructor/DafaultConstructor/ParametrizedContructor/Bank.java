package ObjectandClass.InitilizeObjectbyConstructor.DafaultConstructor.ParametrizedContructor;

public class Bank {

    public static void main(String[] args)
    {

        TestBank tb1 = new TestBank(124, "Dharmendra",2000);
        TestBank tb2 = new TestBank(125,"gaurav",20000);

    tb1.display();
    tb2.display();
    }

}

class TestBank{

    int accountnumber;
    String accountname;
    int amount;

    TestBank(int accnum,String accntname,int amt) {

        accountnumber = accnum;
        accountname = accntname;
        amount = amt;
    }
        void display(){
        System.out.println(accountnumber+" "+accountname+" "+amount);

    }

}
