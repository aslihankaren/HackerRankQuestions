package question.easy;
import java.util.Scanner;

public class HR_5_Question {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();  //==> burda kullanicidan girdileri aliyorum
                int x=sc.nextInt();
                // String'i sol kenara yasla, ilk sütun 15 karakter uzunluğunda
                // Tam sayıyı 3 haneli olarak yaz, gerekirse başına sıfır ekle
                System.out.printf("%-15s%03d\n" , s1,x); //bitisik yazilmasi gerekiyormus ==> burda da
            }
            System.out.println("================================");

        }
    }
/*
PRINTF BICIMLENDIRILMIS CIKTI FONKSIYONU
Java'nın `System.out.printf` fonksiyonu, biçimlendirilmiş çıktı yazdırmak için kullanılır. Bu alıştırmanın amacı, printf kullanarak çıktıyı biçimlendirme anlayışınızı test etmektir.

Java'da `System.out.printf` fonksiyonu, biçimli çıktı yazdırmak için kullanılır. Biçimlendirme, yazdırılacak verinin nasıl görüntüleneceğini belirler ve `%` işareti ile başlayan kontrol dizileri kullanılarak gerçekleştirilir. Örneğin:

- `%d` : tamsayı değerleri için
- `%f` : ondalık sayılar için
- `%s` : dizeler için

Örneğin, bir tamsayıyı biçimlendirilmiş bir şekilde yazdırmak için:

```java
int number = 42;
System.out.printf("The number is: %d\n", number);
```

Yukarıdaki kod parçası, `number` değişkeninin `%d` kontrol dizisiyle biçimlendirilmiş olarak yazdırılmasını sağlar.

Aynı şekilde, ondalık sayıları ve dizeleri de `%f` ve `%s` kontrol dizileriyle biçimlendirebilirsiniz. Biçimlendirme dizeleri arasındaki veriler, sırasıyla biçimlendirme belirleyicileri ile eşleşmelidir.

Bu bilgiler ışığında, verilen girişi biçimlendirip yazdırmak için `System.out.printf` fonksiyonunu nasıl kullanacağınızı gösterebilirim.
 */


