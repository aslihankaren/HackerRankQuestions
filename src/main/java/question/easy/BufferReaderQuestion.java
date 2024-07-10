package question.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderQuestion {

    public static void main(String[] args) throws IOException {


        //BufferedReader, Java'da kullanıcıdan girdi almak için kullanılan bir sınıftır.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //InputStreamReader ise byte akışını karakter akışına dönüştürmek için kullanılır.
        // System.in ise standart giriş akışını temsil eder (kullanıcı tarafından girilen veriler).


        //bufferedReader.readLine() ile kullanıcıdan bir satır girdi alınır. Bu girdi bir String olarak döner.
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        //Integer.parseInt() metoduyla bu String'i bir tamsayıya (int) dönüştürürüz.
        // Bu işlem doğrudan kullanıcıdan alınan girdiyi tamsayıya çevirir


            for(int i=1; i<=10; i++){
                int result=n*i;
                System.out.println(n + " x " + i + " = " + result);
            }

        bufferedReader.close();
        //Kullanılan BufferedReader nesnesini kapatmak iyi bir pratiktir.
        // Bu, kaynakların doğru yönetimini sağlar ve gereksiz bellek kullanımını önler.
    }

}
