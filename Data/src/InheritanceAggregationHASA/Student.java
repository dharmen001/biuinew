package InheritanceAggregationHASA;

public class Student {

    public static void main(String[] args) {
        Author ath = new Author("Me",22,"India");
        Book b = new Book("java",550,ath);
        b.show();
    }
}

class Author{

    String authorname;
    int age;
    String place;
    Author(String name, int age, String place){

        this.authorname = name;
        this.age    = age;
        this.place = place;
    }

    public String getAuthorname()
    {
        return authorname;
    }

    public int getAge()
    {
        return age;
    }

    public String getPlace()
    {
       return place;
    }
}

class Book
{

    String name;
    int Price;
    Author auth;
    Book(String n, int p, Author at)
    {
       this.name = n;
       this.Price = p;
       this.auth = at;
    }

    public void show(){

        System.out.println("Book is"+ name);
        System.out.println("price "+ Price);
        System.out.println("Author is "+auth.getAuthorname());
        System.out.println("Age is "+auth.getAge());
        System.out.println("Place is "+auth.getPlace());
    }

}

