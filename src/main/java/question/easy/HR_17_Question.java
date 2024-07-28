package question.easy;

import java.util.Scanner;

public class HR_17_Question {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        scan.close();

        String reversed = new StringBuilder(A).reverse().toString();
        if (A.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


/*
Bir palindrom, ileriye veya geriye doğru okunduğunda aynı olan bir kelime, ifade, sayı veya diğer karakter dizileridir.

Verilen bir A dizgesine göre, eğer bir palindrom ise Evet yazdırın, aksi takdirde Hayır yazdırın.

Kısıtlamalar:

A en fazla 50 küçük harf İngilizce harften oluşacaktır.
Örnek Girdi:

Kodu kopyala
madam
Örnek Çıktı:

Kodu kopyala
Evet
 */