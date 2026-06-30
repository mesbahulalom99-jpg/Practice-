import java.util.Scanner;

public class class_1 {
    public static int id = 500; 
     public static String name;

     public static void print ()  {
        System.out.println ("...............print...............");
         System.out.println("ID : " + id);
        System.out.println("Name : " + name);
     }

   public static String display ()  {
        System.out.println ("...............disply...............");
         System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        return "Hello" + name;
     }

        public static Integer Calculate ()  {
        System.out.println ("...............Calculate...............");
         int a = 10;
         int b = 20;
         return a + b;
     }

  public static void main (String[] args)  {
        // print();
        // System.out.println(display());
        // System.out.println(Calculate());

        // Scanner check
// Scanner sc = new Scanner (System.in);
// System.out.print("Enter your name : ");
// String name = sc.nextLine();
// System.out.println("Wellcome, " + name);

// System.out.print("Enter your age : ");
// int age = sc.nextInt();
// System.out.println("Are you " + age + " years old ?");
// if (age >=70) {
//     System.out.println("More than Older");
// }
// else if (age >=50 ){
//      System.out.println("Older");
// }
// else if (age >=30 ){
//      System.out.println("Mature");
// }
// else if (age >=18 ){
//      System.out.println("Adult");
// }
// else {
//     System.out.println("Minor");
// }
// }


Scanner sc = new Scanner (System.in);
System.out.print("Enter a number : ");
 int number = sc.nextInt();
System.out.println("Are you " + number + " years old ?");
if (number >0) {
    System.out.println("Positive");

}
else if (number <0 ){
     System.out.println("Negative");
}
else {
    System.out.println("Zero");
}
}

}
     

