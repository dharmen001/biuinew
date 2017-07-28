package Test;

public class PrimeNumber {

    public static void main(String[] args) {

        int n = 44, m, flag = 0;

        m = n / 2;

        for (int i=2;i<=m;i++) {

            if (n % i == 0) {

                System.out.println("Number is not prime");
                flag = 1;
                break;

            }
        }

            if(flag==0) {

                System.out.println("Number is prime");
            }

            }
        }


