package question.easy;

import java.util.Scanner;

public class HR_15_Question {

    public static void main(String[] args) {

/*
Soru:
Bir dize,
𝑆
S ve iki indeks, START ve END verildiğinde, START'tan END-1'e kadar olan (END dahil değil) tüm karakterlerden oluşan bir alt dize yazdırın. Bu challenge'ı tamamlamak için String sınıfının substring yöntemini kullanabilirsiniz.

Girdi Formatı
İlk satır
𝑆
S dizisini içerir.
İkinci satır iki boşlukla ayrılmış tamsayıları içerir; bunlar sırasıyla START ve END değerleridir.
Kısıtlamalar
1≤∣𝑆∣≤100
1≤∣S∣≤100
0≤𝑆𝑇𝐴𝑅𝑇<𝐸𝑁𝐷≤𝑁
0≤START<END≤N
Dize yalnızca İngiliz alfabesi harflerinden (yani, [a-zA-Z]) oluşur.

Çıktı Formatı
START'tan END-1'e kadar olan kapsayıcı aralıktaki alt dizeyi yazdırın.

Örnek Girdi
Kodu kopyala
Helloworld
3 7
Örnek Çıktı
Kodu kopyala
lowo
Açıklama
Aşağıdaki diyagramda, alt dize yeşil renkte vurgulanmıştır:

markdown
Kodu kopyala
0    1    2    3    4    5    6    7    8     9
H    e    l    l    o    w    o   r     l     d
              -    -     -   -
 */


        Scanner scanner=new Scanner(System.in);

        String s= scanner.next();
        int start=scanner.nextInt();
        int end=scanner.nextInt();

// START'tan END'e kadar olan alt dizeyi al (END dahil değil)
        String substring= s.substring(start,end);
        System.out.println(substring);









    }
}
