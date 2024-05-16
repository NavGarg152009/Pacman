/*Shaunak Mukherjee
 * 3-5-24
 * Custom
 */

 import java.util.Random;
 import java.util.Scanner;
 public class CustomP {
     public static void main(String[] args)
     {
         // recordStudent();
         // recordStudent();
         // recordStudent();
         System.out.println(randInt(50, 68));
     }

     static Scanner ear = new Scanner(System.in);

     public static void recordStudent()
     {

         System.out.print("Enter a name: ");
         String name = CustomP.nextLine();

         System.out.print("Year of graduation: ");
         int yog = CustomP.nextInt();

         System.out.println("Name: " + name + ", YOG : " + yog);
     }

     public static int nextInt()
     {
         int num = ear.nextInt();
         ear.nextLine();
         return num;
     }
     public static double nextDouble()
     {
         double num = ear.nextDouble();
         ear.nextLine();
         return num;
     }
     public static String nextLine()
     {
         String string = ear.nextLine();
         return string;
     }
     public static String nextString()
     {
         return nextLine();
     }
     public static int randInt(int low, int upperBound)
     {
         double randomDouble = Math.random();
         int randomNumber = low + (int) (randomDouble * (upperBound - low));
         return randomNumber;
     }
 }

 /* use Custom. method to use all of these methods
 bettter than scanners
 annoucemnts, we define a class level variable, scope is the whole class we can refer to ear from any
 method
  */
