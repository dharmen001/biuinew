//Main outside the class in new class. Better approach.

package ObjectandClass;

class StudentNew {

    int id;
    String name;

}

public class TestStudentNew{

    public static void main(String[] args) {

        StudentNew s1 = new StudentNew();

        System.out.println(s1.id);
        System.out.println(s1.name);
    }

}


