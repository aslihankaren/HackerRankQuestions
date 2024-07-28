package question.easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HR_13_Question {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // US currency format
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        // India currency format (needs custom locale)
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);

        // China currency format
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        // France currency format
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);

        // Print results
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);













    }
}
/* TÜRKCE
Elbette, işte metnin Türkçesi:

Çift duyarlıklı bir sayı olan payment, bir para miktarını ifade eder. Payment'ı ABD, Hindistan, Çin ve Fransa para birimi formatlarına dönüştürmek için NumberFormat sınıfının getCurrencyInstance metodunu kullanın. Ardından biçimlendirilmiş değerleri şu şekilde yazdırın:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
burada formattedPayment, uygun Locale'nin para birimine göre biçimlendirilmiş payment'tır.

Not: Hindistan'ın yerleşik bir Locale'i yoktur, bu nedenle dili en (yani İngilizce) olan bir Locale oluşturmanız gerekmektedir.

Girdi Formatı

Çift duyarlıklı bir sayıyı ifade eden tek bir payment.

Kısıtlamalar
0 <= payment <= 10^9
Çıktı Formatı

İlk satırda, payment'in ABD para birimi için biçimlendirilmiş hali olan u'yu içeren US: u yazdırın.
İkinci satırda, payment'in Hindistan para birimi için biçimlendirilmiş hali olan i'yi içeren India: i yazdırın.
Üçüncü satırda, payment'in Çin para birimi için biçimlendirilmiş hali olan c'yi içeren China: c yazdırın.
Dördüncü satırda, payment'in Fransa para birimi için biçimlendirilmiş hali olan f'yi içeren France: f yazdırın.

Örnek Girdi

12324.134
Örnek Çıktı

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Açıklama

Her satır, payment'in sırasıyla dört ülkenin para birimlerine göre biçimlendirilmiş değerini içerir.

INGILIZCE
Given a double-precision number, payment , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert payment  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  formattedPayment is payment  formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format

A single double-precision number denoting payment .

Constraints
0<=payment <=10^9
Output Format

On the first line, print US: u where u is payment  formatted for US currency.
On the second line, print India: i where i is payment  formatted for Indian currency.
On the third line, print China: c where c is payment  formatted for Chinese currency.
On the fourth line, print France: f, where f is payment  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Explanation

Each line contains the value of  payment formatted according to the four countries' respective currencies.
 */