package JavaPolymorphism.MethodOverloadingInJava.Super;


public class SuperTest6 {

    public static void main(String[] args) {

        Student s1 = new Student("REWA","MP","India",123,"Dharmendra");
        s1.display();
    }
}

class Address{

    String city,state,country;

    Address(String city,String state,String country){

        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class  Student extends Address{

    int id;
    String name;
    Address address;

    Student(String city, String state, String country,int id,String name)
    {
        super(city, state, country);
        this.id = id;
        this.name = name;

    }


    void display(){

        System.out.println(city+" "+state+" "+country+" "+id+" "+name);
    }
}

