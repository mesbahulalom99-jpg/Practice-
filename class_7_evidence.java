import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class class_7_evidence {

    // private static int input;

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int sum = 0;
        // System.out.println("Enter numbers to calculate the conditional sum : ");
        // while (true) {
        // System.out.print("Enter a number : ");
        // input = sc.nextInt();
        // if (input == -1) {
        // break;
        // }
        // sum += input;
        // }
        // System.out.println("Conditional Sum : " + sum);

        // 222222222222222222222222222222222222222222222222222222222
        // Scanner sc = new Scanner(System.in);

        // int[] numbers = { 5, 12, 3, 21, 8 };
        // int sum = 0;

        // System.out.print("Array elements: ");
        // for (int num : numbers) {
        // System.out.print(num + " ");
        // sum += num;
        // }
        // System.out.println();
        // System.out.println("Sum of array elements: " + sum);

        // 3333333333333333333333333333333333333333333333333333333333333333333

        // int[][] matrix = {
        // {3, 5, 1},
        // {2, 8, 4},
        // {6, 1, 9}
        // };

        // int sum = 0;
        // System.out.println("2D Array elements:");

        // for (int i = 0; i < matrix.length; i++) {

        // for (int j = 0; j < matrix[i].length; j++) {
        // System.out.print(matrix[i][j] + " ");
        // sum += matrix[i][j];
        // }
        // System.out.println();
        // }

        // System.out.println("\nSum of all elements: " + sum);

        // 4444444444444444444444444444444444444444444444444444444444444444444

        // System.out.println("_____Factorial number____ ");
        // int num = 10;
        // for (int i = 1; i <= 10; i++)
        // System.out.println(i + " X " + num + " = " + (i * num));

        // 55555555555555555555555555555555555555555555555555555555555555555

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Entry a number : ");
        // int num = sc.nextInt();

        // boolean isPrime = true;

        // if (num <= 1) {
        // isPrime = false;
        // } else {

        // for (int i = 2; i <= Math.sqrt(num); i++) {
        // if (num % i == 0) {
        // isPrime = false;
        // break;
        // }
        // }

        // }
        // if (isPrime) {
        // System.out.println(num + " This is a Prime Number");
        // } else {
        // System.out.println(num + " This is not a Prime Number");
        // }

        // 666666666666666666666666666666666666666666666666666666666666666666666666666666

        // Integer[] sortArray = { 40, 10, 70, 20, 30, 10, 100, 11 };
        // Arrays.sort(sortArray);
        // System.out.println("Sorted Array");
        // System.out.println(Arrays.toString(sortArray));

        // int[] arr = { 5, 2, 9, 1, 7 };

        // for (int i = 0; i < arr.length; i++) {

        // for (int j = i + 1; j < arr.length; j++) {

        // if (arr[i] > arr[j]) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        // System.out.println("Ascending Array: ");
        // for (int i : arr) {
        // System.out.print(i + " ");
        // ;
        // }
        // System.out.println("\n");

        // int[] arr = { 5, 2, 9, 1, 7 };

        // for (int i = 0; i < arr.length; i++) {

        // for (int j = i + 1; j < arr.length; j++) {

        // if (arr[i] < arr[j]) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }
        // System.out.println("Descending Array: ");
        // // System.out.println(Arrays.toString(arr));

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a list of numbers separated by commas: ");
        // String line = input.nextLine();
        // String[] array = line.split(",");
        // System.out.println("The array: " + Arrays.toString(array));
        // int max = Integer.parseInt(array[0].trim());
        // int min = Integer.parseInt(array[0].trim());
        // for (String string : array) {
        // int num = Integer.parseInt(string.trim());
        // if (num > max) {
        // max = num;
        // }
        // if (num < min) {
        // min = num;
        // }
        // }
        // System.out.println("The max number is: " + max);
        // System.out.println("The min number is: " + min);

        ////////////////////////////////////////////////////////////

        Set<Integer> uniqueNumbers = new HashSet<>(); // HashSet for storing unique numbers

        while (uniqueNumbers.size() < 10) {
            int number = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
            uniqueNumbers.add(number);
        }

        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}