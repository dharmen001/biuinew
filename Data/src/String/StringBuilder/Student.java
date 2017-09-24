package String.StringBuilder;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Student {

    int id;
    String name;
    String city;

     Student(int id, String name,String city) {

         this.id = id;
         this.name = name;
         this.city = city;
     }
        /* public String  toString()
         {

             return id + " "+name+" "+city;


         }*/

         public static void main(String [] args){

         Student s1 = new Student(12,"Dharmendra","Rewa");
         Student s2 = new Student(12,"Aftab","Bhadoi");
             System.out.println(s1);
             System.out.println(s2);

         }
     }


