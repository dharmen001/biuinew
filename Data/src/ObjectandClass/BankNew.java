package ObjectandClass;
//Real World Example
public class BankNew {
    public static void main(String[] args) {

        Account a1 = new Account();

        a1.insert("Dharmendra",2345,1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(20000);
        a1.checkBalance();
        a1.withdraw(5000);
        a1.checkBalance();
    }

}

class Account{

    String name;
    int accountNum;
    float amount;

    void insert(String s,int a,float amnt){

        name = s;
        accountNum = a;
        amount = amnt;
    }

    void deposit(float amnt){

        amount = amount+amnt;

        System.out.println(amnt+"deposited");
    }

    void withdraw(float amnt)
    {

        if (amount<amnt)
        {

            System.out.println("Insufficient fund");
        }
        else
            {

            amount= amount-amnt;

            System.out.println(amnt+"withdrawn");

            }
    }

void checkBalance()
{
    System.out.println("Balance is:"+amount);
}

void display(){

    System.out.println(accountNum+" "+name+" "+amount);
}

}
