package question.easy;

import java.util.Scanner;

public class HR_16_Question {



/*
Terimleri şu şekilde tanımlıyoruz:

Sözlük Düzeni, alfabetik veya sözlük sırası olarak da bilinir, karakterleri şu şekilde sıralar:
A<B<.........<Y<Z<a<b<............<y<z
Örneğin, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

Bir dizgenin alt dizisi, dizgedeki ardışık karakter bloklarıdır. Örneğin, abc dizisinin alt dizileri a, b, c, ab, bc ve abc'dir.
Bir dizge S ve bir tamsayı k verildiğinde, k uzunluğundaki alt dizilerin sözlükteki en küçük ve en büyük olanlarını bulan fonksiyonu tamamlayın.

Fonksiyon Açıklaması

Aşağıdaki parametrelere sahip getSmallestAndLargest fonksiyonunu tamamlayın:

string s: bir dizge
int k: bulunacak alt dizilerin uzunluğu
Döndürür

string: iki alt diziyi içeren bir dizge, aralarında yeni satır karakteri ile (' + "\n" + ') ayrılmış
Girdi Formatı

İlk satır, bir dizge olan S'yi içerir.
İkinci satır, bir tamsayı olan k'yı içerir.

Kısıtlamalar
1<=|S<=1000
S sadece İngilizce alfabetik harflerden (yani, [a-zA-Z]) oluşur.
Örnek Girdi 0

welcometojava
3
Örnek Çıktı 0

ava
wel
Açıklama 0

S="welcometojava" dizgesi, K=3 uzunluğundaki aşağıdaki sözlük sırasına göre sıralanmış alt dizilere sahiptir:
["ava" , "com", "elc" , " eto" ......
Daha sonra, ilk (sözlükteki en küçük) alt dizeyi ve son (sözlükteki en büyük) alt dizeyi iki yeni satır karakteri ile ayrılmış değerler olarak döndürürüz (yani, ava\nwel).

Stub kodu daha sonra ava'yı çıktımızın ilk satırı ve wel'i çıktımızın ikinci satırı olarak yazdırır.
 */
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}