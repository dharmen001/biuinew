package Inheritance.SingleInheritance;

public class SbI {

    public static void main(String[] args) {

        SbiMysore st1 = new SbiMysore(1000,20000,1000);

        st1.display();
  }
}

class SbiTravancore {

    int amount;
    int withdrawn;
    int deposit;

    SbiTravancore(int amount, int withdrawn, int deposit) {

        this.amount = amount;
        this.withdrawn = withdrawn;
        this.deposit = deposit;
    }

}

class SbiMysore extends SbiTravancore{

    SbiMysore(int amount, int withdrawn, int deposit) {
        super(amount, withdrawn, deposit);
    }

    void display(){

        System.out.println(amount+" "+withdrawn+" "+deposit);
    }

}
