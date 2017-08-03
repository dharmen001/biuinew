package ObjectandClass.CopyConstructor;



public class School {


    public static void main(String[] args) {


        TestSchool ts1 = new TestSchool(100,20, "sardar ajeet singh",25);
        TestSchool ts2 = new TestSchool(ts1);
        TestSchool ts3 = new TestSchool(ts2);

        ts1.display();
        ts2.display();
        ts3.display();

    }

}

class TestSchool

{

    int student;
    int teacher;
    String schoolname;
    int rooms;

    TestSchool(int s, int t, String sn)
    {
        student = s;
        teacher = t;
        schoolname = sn;
    }

    TestSchool(int s, int t, String sn,int r)
    {
        student = s;
        teacher = t;
        schoolname = sn;
        rooms = r;
    }

    TestSchool(TestSchool ts)
    {

        student = ts.student;
        teacher = ts.teacher;
        schoolname = ts.schoolname;
        rooms = ts.rooms;

    }

    void display()
    {

        System.out.println(student+" "+teacher+" "+schoolname+" "+rooms);

    }

}