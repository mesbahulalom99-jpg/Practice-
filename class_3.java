public class class_3 {

    public static void main(String[] args) {
        // String text = "Java Programming";
        // System.out.println(\nlanth);

        // System.out.println("ntoupperCase");
        // System.out.println(text.toUpperCase());

        // System.out.println("nstartswith");
        // System.out.println(text.nstartswith( "Java"));

        // System.out.println("\nsubstring");
        // System.out.println(text.substring(0, 4) );

        // System.out.println("\nreplace");
        // System.out.println(text.replace("Java", "Spring") );
        // System.out.println(text);

        // System.out.println("\ncompareTo()");
        // System.out.println(text.contains("Java") );

        // System.out.println("\nsplit()");
        // String csv =" Java, Spring, Angular, Oracle";
        // String[] skills = csv.split(",");
        // for (String skill : skills) {
        // System.out.println(skill);
        // }

        // int[] marks = new int [5];

        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // marks[3] = 40;
        // marks[4] = 50;
        // System.out.println(Arrays.toString(marks));

        // int[] scores = { 10, 50, 40, 20, 5, 9, 100 };
        // int min = scores[0];
        // int max = scores[0];

        // for (int score : scores) {
        //     if (score > max) {
        //         max = score;
        //     }
        //     if (score < min) {
        //         min = score;
        //     }
        // }
        // System.out.println("Minimum number is : " + min);
        // System.out.println("Maximum number is : " + max);
        

        int [] num ={10,50,40,20,5,9,100};

        int min = num[0];
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
        if (num[i] > max) {
        max = num[i];
        }
        if (num[i] < min) {
        min = num[i];
        }
        }
        System.out.println("Minimum number is : " + min);
        System.out.println("Maximum number is : " + max);

    }
}
