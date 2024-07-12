package question.easy;

import java.util.Scanner;

public class HR_7_Question {

    public static void main(String []argh){


        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // Initialize the series
            int sum = a;
            for (int j = 0; j < n; j++) {
                // Add the next term in the series
                sum += (int)Math.pow(2, j) * b;
                // Print the current term
                System.out.print(sum + " ");
            }
            // Move to the next line for the next query
            System.out.println();

        }
        in.close();
    }
}