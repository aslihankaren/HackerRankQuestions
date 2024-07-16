package question.easy;

import java.util.Scanner;

public class HR_9_Question {

    public static void main(String[] args) {


      /*
      "End-of-file" (EOF), dosya veya veri akışının sonunu belirtmek için kullanılan bir terimdir. Bir dosya veya veri akışı okunduğunda, EOF işareti, bu noktada daha fazla veri olmadığını gösterir. EOF, genellikle bir dosyanın sonunda bulunan özel bir bayt veya karakterdir. Programlar, dosya veya veri akışını okurken EOF işaretini gördüklerinde, okuma işlemini durdurur ve işlemi sonlandırır. Bu sayede, dosya veya veri akışının sonu belirtilmiş olur.
       Java'da EOFException adında bir istisna sınıfı bulunmaktadır. Bu istisna sınıfı, dosya işlemleri veya veri akışları sırasında dosyanın veya veri akışının sonuna geldiğinizde fırlatılır. Bu durum, dosya veya veri akışının sonunu işaret eden bir durum olarak algılanabilir.
       */

/*
==>QUESTION:The challenge here is to read n lines of input until you reach EOF, then number and print all  n lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
 */

        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        scanner.close();







    }
}
