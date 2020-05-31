import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        String longestWord="";
        int linesWithHarry = 0;
        try {
            Scanner scanner = new Scanner(new FileInputStream("harryPotterChapterOne.txt"));
            String currentLine;
            while (scanner.hasNext()){
                currentLine = scanner.nextLine();
                String[] wordsTmp = currentLine.split(" ");
                for (int i=0;i<wordsTmp.length;i++){
                    if (!wordsTmp.equals(" "))
                        words.add(wordsTmp[i].replaceAll("[^a-zA-Z ]", ""));
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(words);
        words.sort(String::compareToIgnoreCase);
        System.out.println(words);
        System.out.println(linesWithHarry);
    }
}
