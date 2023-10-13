import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(1,100);
        int b = random.nextInt(1,100);
        плюс(a,b);

    }

    static  int  вычитание (int a,int b ) {
        int sum = a -b;
        System.out.println(sum);
         return sum;


        }

     public static int плюс (int a, int b){
             int sum = a + b;
         System.out.println(sum);
         return sum;

         }
     }

