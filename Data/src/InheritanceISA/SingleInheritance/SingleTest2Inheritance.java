package InheritanceISA.SingleInheritance;

public class SingleTest2Inheritance {

    public static void main(String[] args) {

        SchoolBranch sb1 = new SchoolBranch("Froms",10,20,30);

           sb1.disp() ;
        }
    }


class School{

    String name;
    int Studentno;
    int noofrooms;
    int noofteacher;

    School(String name,int Studnetno,int noofrooms,int noofteacher){

        this.name = name;
        this.Studentno = Studnetno;
        this.noofrooms = noofrooms;
        this.noofteacher = noofteacher;
    }
}


class SchoolBranch extends School{


    SchoolBranch(String name, int Studnetno, int noofrooms, int noofteacher) {
        super(name, Studnetno, noofrooms, noofteacher);
    }

    void disp(){

        System.out.println(name+" "+Studentno+" "+noofrooms+" "+noofteacher);
    }

}
