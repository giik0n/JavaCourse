import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileInputStream("harryPotterChapterOne.txt"));
            String currentLine;
            while (scanner.hasNext()){
                currentLine = scanner.nextLine();
                String[] wordsTmp = currentLine.split(" ");
                for (int i=0;i<wordsTmp.length;i++){
                    if (!wordsTmp.equals(" ")||!wordsTmp.equals("\n"))
                        words.add(wordsTmp[i].replaceAll("[^a-zA-Z ]", ""));//Clean the words from a punctuation signs.
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(words);
        words.sort(String::compareToIgnoreCase);//Order the words in alphabetic order.
        System.out.println(words);
    }
}
