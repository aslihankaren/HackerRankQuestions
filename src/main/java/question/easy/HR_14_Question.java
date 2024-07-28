package question.easy;

import java.util.Scanner;

public class HR_14_Question {
    public static void main(String[] args) {

/*
SORU.Elbette! İşte metnin Türkçe çevirisi:

---

"Bir dize geleneksel olarak ya bir sabit ya da bir tür değişken olarak karakterlerin bir sırasıdır." — Wikipedia: Dize (bilgisayar bilimi)

Bu alıştırma, Java Dize'lerini anlama düzeyinizi test etmek için hazırlanmıştır. Örnek bir Dize bildirimi:

```java
String myString = "Hello World!";
```

Bir Dize'nin elemanlarına karakterler denir. Bir Dize'deki karakter sayısına uzunluk denir ve String.length() yöntemi ile alınabilir.

Küçük harfli İngilizce harflerden oluşan iki dize verildiğinde, A ve B, aşağıdaki işlemleri gerçekleştirin:

1. A ve B'nin uzunluklarının toplamını hesaplayın.
2. A'nın sözlük sırasına göre B'den daha büyük olup olmadığını belirleyin (yani: B, A'dan önce mi gelir?).
3. A ve B'nin ilk harfini büyük yapın ve tek bir satırda, aralarında bir boşluk olacak şekilde yazdırın.

Girdi Formatı

İlk satır bir dize A içerir. İkinci satır başka bir dize B içerir. Dize'ler yalnızca küçük harfli İngilizce harflerden oluşur.

Çıktı Formatı

Üç satırlık çıktı vardır:
İlk satırda, A ve B'nin uzunluklarının toplamını yazdırın.
İkinci satırda, A, B'den sözlük sırasına göre büyükse Yes, değilse No yazdırın.
Üçüncü satırda, hem A hem de B'nin ilk harfini büyük yapın ve aralarında bir boşluk olacak şekilde tek bir satırda yazdırın.

Örnek Girdi 0

hello
java

Örnek Çıktı 0

9
No
Hello Java

Açıklama 0

A dizisi "hello" ve B dizisi "java".

A'nın uzunluğu 5 ve B'nin uzunluğu 4'tür; uzunluklarının toplamı 9'dur.
Sözlük sırasına göre, "hello" "java"dan önce gelir; bu nedenle, A, B'den büyük değildir ve cevap Hayır'dır.

Hem A hem de B'nin ilk harfini büyük yapıp ardından aralarında bir boşluk olacak şekilde yazdırdığınızda, "Hello Java" elde edersiniz.
 */

        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();

        int totalLength=a.length()+b.length();
        System.out.println("Total Length :"+ totalLength);

//Sözlük Sırasına Göre Karşılaştırma:
        if (a.compareTo(b)>0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


//İlk Harfi Büyük Yapma:
        String capitalizedA = a.substring(0,1).toUpperCase()+ a.substring(1);
        String capitalizedB = b.substring(0,1).toUpperCase()+ b.substring(1);

        System.out.println(capitalizedA+capitalizedB);



    }
}
