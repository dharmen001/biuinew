package InheritanceAggregationHASA;

public class NewAddress {

    public static void main(String[] args) {

        Address a1 = new Address("Ger","UP","India");
        Address a2 = new Address("Noida","UP","India");
        Emp e1 = new Emp(111,"Varun",a1);
        Emp e2 = new Emp(112,"Arun",a2);

        e1.display();
        e2.display();
    }
}

class Address{

    String city,state,country;

    Address(String city,String state, String country){

        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class  Emp{

    int id;
    String name;
    Address address;

    Emp(int id, String name, Address address){

        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){

        System.out.print(id+" "+name+" ");
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

}

