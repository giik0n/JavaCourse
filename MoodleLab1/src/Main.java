import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<String> allWords = new ArrayList<>();
        ArrayList<Integer> distinctHashes = new ArrayList<>();
        String longestWord="";
        int linesWithHarry = 0;
        try {
            Scanner scanner = new Scanner(new FileInputStream("harryPotterChapterOne.txt"));
            String currentLine;
            while (scanner.hasNext()){
                currentLine = scanner.nextLine();
                String[] words = currentLine.split(" ");
                for (int i=0;i<words.length;i++){
                    allWords.add(words[i].replaceAll("[^a-zA-Z ]", ""));//Making list of all words
                    if (words[i].length()>longestWord.length()) longestWord = words[i];//Finding longest word

                }
                if (currentLine.contains("Harry")) linesWithHarry++;//Counting "Harry" lines

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < allWords.size(); i++) {
            if (!distinctHashes.contains(allWords.get(i).hashCode())){
                distinctHashes.add(allWords.get(i).hashCode());
            }
        }
        System.out.println(longestWord);
        System.out.println(linesWithHarry);
        System.out.println(allWords.size());//Count of all words in text
        System.out.println(distinctHashes.size());// Count of unique hashCodes


    }
}
