import java.util.Scanner;

public class Employee {
public static void main(String[] args)  {
    
Scanner sc = new Scanner (System.in);

System.out.print("Enter your name : ");
String name = sc.nextLine();
System.out.println("Wellcome, " + name);



int age =45;
if (age >=50) {
    System.out.println("Older");
}
else if (age >=18 ){
     System.out.println("Adult");
}
else {
    System.out.println("Minor");
}

}}



