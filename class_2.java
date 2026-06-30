import java.util.Scanner;

import javax.smartcardio.TerminalFactory;

public class class_2 {
    public static void main (String[] args)  {


// Scanner sc = new Scanner (System.in);
// System.out.print("Enter first number : ");
//  int number = sc.nextInt();
// System.out.print("Enter 2nd number : ");
//  int secondnumber = sc.nextInt();


// Largest and Smallest Number check:
// if (number > secondnumber) {
//     System.out.println("Largest Number is : " + number);

// }

// else {
//     System.out.println("Smallest Number is : " + number);}


// nexted if statement:
// int age =17;
// double cgpa = 3.6;

// if (age >= 18) {
//     if (cgpa >= 3.8) {
//         System.out.println("Admitted: Scholorshop Program");
//     }
//     else if (cgpa >= 3.5) {
//         System.out.println("Admitted: Regular Program");
//     }
//     else {
//         System.out.println("Rejected: Under CGPA");
//     }
// }
// else {
//     System.out.println("Rejected: Under Age");
// }



// switch case!
// Scanner sc = new Scanner (System.in);
// System.out.print("Enter Day : ");


// String Day = sc.nextLine();
// switch (Day) {

//     case "Monday":
//         System.out.println("Start of Week");
//         break;
        
//     case "Friday":
//         System.out.println("Weekend is coming");
//         break;

//     case "Sunday":
//         System.out.println("Holiday");
//         break;

//     default:
//         System.out.println("Normal Day");
// }


// Terminy operator: :
// System.out.print("Terminy operator: ");

// age = 85;
// String status = (age >= 18) ? "Adult" : "Minor";
// System.out.println(status);



// Relationship operator: :
// System.out.print("Relationship operator: ");

// System.out.println("age == 18 : " + (age == 18));
// System.out.println("age != 18 : " + (age != 18));
// System.out.println("age > 18 : " + (age > 18));
// System.out.println("age < 18 : " + (age < 18));
// System.out.println("age >= 18 : " + (age >= 18));
// System.out.println("age <= 18 : " + (age <= 18));


// example discount
// Scanner sc = new Scanner (System.in);
// System.out.print("Enter parchase amount : ");
// int amount = sc.nextInt();
// if (amount >= 2000) {
//     System.out.println("amount: " + amount + ", Discount : " + amount * 0.2 + ", Payable :" + (amount - amount * 0.2));
// }
// else if (amount >= 1000) {
//      System.out.println("amount: " + amount + ", Discount : " + amount * 0.1 + ", Payable :" + (amount - amount * 0.1));}
// else {
//     System.out.println(" No Discount ");}



// or Short system


// System.out.println("discount example: ");
// double amount = 3500;
// double discount;

// if (amount >= 2000) {
//     discount  = amount * 0.20;
// }
// else if (amount >= 1000) {
//     discount = amount * 0.10;
// }
// else {
//     discount = 0;
// }
// System.out.println("Amount: " + amount );
// System.out.println("Discount : " + discount);
// System.out.print("Payable :" + (amount - discount));


// 1. For Loop

// System.out.println("_____For Loop____ ");

// for (int i = 0; i <= 5; i++) {
//     System.out.println("For Loop: " + i);}


//     // 2. While Loop

// System.out.println("_____While Loop____ ");

// int j = 1;
// While (j <= 5) {
//     System.out.println("While Loop: " + j);
//     j++;}


    


//  For Loop
//     String[] fruits =
//      {"Apple",
//       "Banana",
//        "Orange",
//        "Mango",
//         "Pineapple"
//     };

//     for (String fruits1 : fruits) {
//       if (fruits1.equals("Apple")) {
//         System.out.println("Pineapple");
//       }
// else if (fruits1.equals("Banana")) {
//         System.out.println("Mango");
//       }
//       else if  (fruits1.equals("Orange")) {
//         System.out.println("Orange");}


// System.out.println("_____Nested Loop____ ");

// for (int row =1 ; row <= 3; row++) {
//     for (int col = 1; col <= 4; col++) {
//         System.out.println("Hablu");
//     }
// System.out.println();


// System.out.println("_____Nested Loop(Even Number)____ ");

// for (int num =1 ; num <= 100; num++) {
//     if (num % 2 == 0) {
//         System.out.println("Even Number: " + num);
//     }



// System.out.println("_____for Loop(1 -20 Total)____ ");

// int sum = 0;
// for (int i = 0 ; i <= 20; i++) {
// sum +=  i;}
//  System.out.println("Total Number: " + sum);


// System.out.println("_____Factorial number____ ");


// for (int i = 1 ; i <= 10; i++) {
//     for (int ma = 1 ; ma <= 10; ma++){
//  System.out.println(i + " X " + ma + " = " + (i * ma));}
//  System.out.println();}


// System.out.println("_____Factorial number____ ");
// int num = 10;
// for (int i = 1 ; i <= 10; i++)
//  System.out.println(i + " X " + num + " = " + (i * num))


// Half Piramid
// int n =10;
//     System.out.println("Half Piramid");
//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print("*");
//         }
//         System.out.println();}


int n =10;
    System.out.println("Half Piramid reverse");
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();}

}}



