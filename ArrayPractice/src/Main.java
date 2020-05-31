import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> discintwords = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileInputStream("harryPotterChapterOne.txt"));//1.  Find in the net and download a text version of a novel about Harry Potter.
            String currentLine;
            while (scanner.hasNext()){
                currentLine = scanner.nextLine();
                String[] wordsTmp = currentLine.split(" ");
                for (int i=0;i<wordsTmp.length;i++){
                    if (!wordsTmp.equals(" ")||!wordsTmp.equals("\n"))
                        words.add(wordsTmp[i].replaceAll("[^a-zA-Z ]", ""));//2. Split the novel into an array of words. + 3. Clean the words from a punctuation signs.
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < words.size(); i++) {//4. Create another array containing distinct words.
            if (!discintwords.contains(words.get(i))){
                discintwords.add(words.get(i));
            }
        }

        System.out.println(words);
        words.sort(String::compareToIgnoreCase);//5. Order the words in alphabetic order.
        discintwords.sort(String::compareToIgnoreCase);//5. Order the distinct words in alphabetic order.
        System.out.println(words);
    }
}
