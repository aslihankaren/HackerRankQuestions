package question.easy;

import java.util.Scanner;

public class HR_19_Question {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Write your code here.
        // Split the string based on non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");

        // Use a counter to count valid tokens
        int count = 0;

        // Check and print each token
        for (String token : tokens) {
            if (!token.isEmpty()) {
                count++;
            }
        }

        // Print the number of tokens
        System.out.println(count);

        // Print each non-empty token on a new line
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }

        scan.close();








    }


}
