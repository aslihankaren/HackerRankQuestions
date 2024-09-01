package question.easy;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HR_20_Question {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases > 0){
            String pattern = in.nextLine();
            try {
                // Try to compile the pattern
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                // If a PatternSyntaxException is thrown, the pattern is invalid
                System.out.println("Invalid");
            }
            testCases--;
        }

        in.close();










    }
}
