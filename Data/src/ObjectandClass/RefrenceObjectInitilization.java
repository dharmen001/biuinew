package ObjectandClass;
// Initializing object simply means storing data into object.

public class RefrenceObjectInitilization {

    public static void main(String[] args) {

        Student12 s12 = new Student12();

        s12.id = 10;
        s12.name = "dharmendra";
        System.out.println(s12.id+" "+s12.name);


    }

}

class Student12{

    int id;
    String name;
}