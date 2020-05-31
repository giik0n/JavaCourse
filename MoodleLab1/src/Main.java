import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> noHarryPotterWords = new ArrayList<>();
        String longestWord="";
        int linesWithHarry = 0;
        try {
            Scanner scanner = new Scanner(new FileInputStream("harryPotterChapterOne.txt"));
            String currentLine;
            while (scanner.hasNext()){
                currentLine = scanner.nextLine();
                String[] words = currentLine.split(" ");
                for (int i=0;i<words.length;i++){
                    if (words[i].length()>longestWord.length()) longestWord = words[i];
                    if (!words[i].equals("Harry")&&!words[i].equals("Potter")) noHarryPotterWords.add(words[i]);
                }
                if (currentLine.contains("Harry")) linesWithHarry++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(longestWord);
        System.out.println(linesWithHarry);


    }
}
