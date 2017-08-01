package ObjectandClass.InitilizeObjectbyConstructor.DafaultConstructor.DefaultConstructor;

//If there is no constructor in a class, compiler automatically created a default constructor

public class DefaultC {

    DefaultC()/*Constructor Default* Purpose is, it proivdes default value like 0, null */
    {
        System.out.println("DefaultC is Created");
    }

    public static void main(String[] args) {

        DefaultC dc = new DefaultC();


    }

}
