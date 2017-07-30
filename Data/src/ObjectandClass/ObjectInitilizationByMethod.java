package ObjectandClass;

public class ObjectInitilizationByMethod {
    public static void main(String[] args) {

        NewStudent s1 =new NewStudent();
        NewStudent s2 = new NewStudent();

        s1.insertrecord(111,"Dharmendra");
        s2.insertrecord(222,"Rajeev");

        s1.displayinformation();
        s2.displayinformation();

    }


}

class NewStudent{

    int rollNumber;
    String Name;

    void insertrecord(int r, String n){

        rollNumber = r;
        Name = n;
    }

    void displayinformation(){
        System.out.println(rollNumber+" "+Name);
    }


}
