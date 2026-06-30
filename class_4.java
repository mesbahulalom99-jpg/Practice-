import java.util.Arrays;
import java.util.Collections;

public class class_4 {
   
    public static void main (String[] args)  {

// Integer[] sortArray = {40,10,70,20,30,10,100,11};
// Arrays.sort(sortArray);
// System.out.println("Sorted Array");
// System.out.println(Arrays.toString(sortArray));

// Integer [] arr = {5,2,9,1,3};
// Arrays.sort(arr,Collections.reverseOrder());
// System.out.println(Arrays.toString(arr));

// Arrays.sort(arr,1,4);
// System.out.println(Arrays.toString(arr));


// String [] sortArray = {"Ali", "Sadia", "Mohammad", "Rakib","Kamal", "Mamun"};
// Arrays.sort(sortArray);
// System.out.println("Sorted Array");
// System.out.println(Arrays.toString(sortArray));

// Arrays.sort(sortArray, (a,b)-> a.length()-b.length());
// System.out.println(Arrays.toString(sortArray));



// int [] reverseArray = {5,6,7,1,5,3,4};

// for (int i =  reverseArray.length-1; i>=0; i--) {

//     System.out.print(reverseArray[i] + " ");
// }



int [] [] matrix = {
    {1,2,3},
    {4,5,6,7},
    {7,8,9},
    {10,11,12}
};

System.out.println(".......2D array.......");
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
    }
    System.out.println();
}
// or
for (int[] row : matrix) {
    for (int col : row) {
        System.out.print(col + " ");
    }
    System.out.println();
}



}}
