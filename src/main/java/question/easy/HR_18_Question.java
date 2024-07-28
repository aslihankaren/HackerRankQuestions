package question.easy;
import java.util.Scanner;
public class HR_18_Question {

    static boolean isAnagram(String a, String b){

        // Eğer iki stringin uzunlukları farklıysa, anagram olamazlar
        if(a.length() != b.length()){
            return false;
        }

        // Karakter frekanslarını tutmak için 26 elemanlı bir dizi (alfabe için)
        int[] charCount=new int[26];



        // Stringleri küçük harfe dönüştürelim ve karakter frekanslarını sayalım
        for (int i=0; i<a.length(); i++){
            charCount[a.charAt(i) - 'a']++;
            charCount[b.charAt(i) - 'a']--;
        }

        // Dizideki tüm değerlerin sıfır olup olmadığını kontrol edelim
        for(int count: charCount){
            if(count!= 0)
                return false;
        }


        return true;
    }

    public static void main(String[] args) {

//anagram



Scanner scanner=new Scanner(System.in);
String a=scanner.next();
String b=scanner.next();
scanner.close();

boolean ret=isAnagram(a,b);
        System.out.println();


    }
}
