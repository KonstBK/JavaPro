package homework5;

import java.util.Scanner;

public class StringChanger {
    public static void main(String[] args) {
        String sentence = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        StringBuilder reversedString = new StringBuilder();
        StringBuilder reversedWords;


        for (String word: sentence.split("Z")) {
            reversedWords = new StringBuilder(word).reverse();
            reversedString.append(reversedWords + " ");
        }
        System.out.println(reversedString);
    }
}
