package ObjectandClass;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter first number");
        a= s1.nextInt();
        System.out.println("Enter Second number");
        b= s1.nextInt();

        System.out.println("please enter the operation + - / or *");
        Scanner s2= new Scanner(System.in);
        String Operation = s2.next();

        if(Operation.equals("+")){

            System.out.println("Your Answer is: "+ (a+b));
        }

        if(Operation.equals("-")){

            System.out.println("Your Answer is: "+ (a-b));
        }

        if(Operation.equals("/")){

            System.out.println("Your Answer is: "+ (a/b));
        }

        if(Operation.equals("*")){

            System.out.println("Your Answer is: "+ (a*b));
        }




    }

}

