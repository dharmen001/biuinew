package InheritanceAggregationHASA;



public class StudentNew {

    public static void main(String[] args) {
        Address1 ad1 = new Address1("MP","India","REWA");
        Address1 ad2 = new Address1("Dhar","India","REWA");
        NewWorker nw = new NewWorker(222,"Dhrmendra",ad1);
        NewWorker nw2 = new NewWorker(222,"Gaurav",ad2);

        nw.display();
        nw2.display();

    }
}

class Address1{
    String state;
    String city;
    String country;
    Address1(String state,String city,String country){
        this.country = country;
        this.city = city;
        this.state = state;
    }

}

class Worker{

    int id;
    String name;
    Address1 ad1;

    Worker(int id, String name,Address1 ad1){

        this.id = id;
        this.name = name;
        this.ad1 = ad1;
    }
}

class NewWorker extends Worker{

    NewWorker(int id, String name, Address1 ad1) {
        super(id, name, ad1);
    }

    void display(){

        System.out.println(id+" "+name);
        System.out.println(ad1.city+" "+ad1.country+" "+ad1.state);
    }
}