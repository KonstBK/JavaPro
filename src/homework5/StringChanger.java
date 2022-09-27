package homework5;

import java.util.Scanner;

public class StringChanger {
    public static void main(String[] args) {
        StringChanger.stringRevesrerAndSplitter("ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом");
    }

    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

    public static void stringRevesrerAndSplitter(String someString){
        String[] stringArray = someString.split("[\\p{Punct}\\sZ-z]+");
        StringBuilder storage = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            String word = stringArray[i];
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();

            storage.append(sb);
        }
        System.out.println(storage);
    }


}
