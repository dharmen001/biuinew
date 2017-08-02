package ObjectandClass.InitilizeObjectbyConstructor.DafaultConstructor.ParametrizedContructor;
//Constructor overloading
public class Countries {

    public static void main(String[] args) {

        TestCountries tc1 = new TestCountries(1, "India", "one", 230000);
        TestCountries tc2 = new TestCountries(2, "USA", "Two", 300000);
        TestCountries tc3 = new TestCountries(3, "USA", "Two");


        tc1.display();
        tc2.display();
        tc3.display();
    }
}


class TestCountries{

    int regionid;
    String countryname;
    String countrycode;
    int population;

    TestCountries(int i, String cn, String cc){

        regionid = i;
        countryname = cn;
        countrycode = cc;
    }
TestCountries(int i, String cn, String cc,int pp){
    regionid = i;
    countryname = cn;
    countrycode = cc;
    population = pp;

}

void display(){
    System.out.println(regionid+" "+countryname+" "+countrycode+" "+population);
}

}




