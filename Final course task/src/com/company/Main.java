package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/*
 * @author Alexander Panyshchev
 * @since 6/23/20
 * @version 1.0
 * Task: Glossary
 *  1.1. Download a text about Harry Potter.
    1.2. For each distinct word in the text calculate the number of occurrence.
    1.3. Use RegEx.
    1.4. Sort in the DESC mode by the number of occurrence..
    1.5. Find  the first 20 pairs.
    1.6  Find all the proper names
    1.7.  Count them and arrange in alphabetic order.
    1.8.  First 20 pairs and names write into to a file test.txt
    1.9.  Create a fine header for the file
    1.10  Use Java  Collections to demonstrate your experience (Map, List )
 */
public class Main {
    static String fileHeader =
            "  _    _                         _____      _   _            \n" +
                    " | |  | |                       |  __ \\    | | | |           \n" +
                    " | |__| | __ _ _ __ _ __ _   _  | |__) |__ | |_| |_ ___ _ __ \n" +
                    " |  __  |/ _` | '__| '__| | | | |  ___/ _ \\| __| __/ _ \\ '__|\n" +
                    " | |  | | (_| | |  | |  | |_| | | |  | (_) | |_| ||  __/ |   \n" +
                    " |_|  |_|\\__,_|_|  |_|   \\__, | |_|   \\___/ \\__|\\__\\___|_|   \n" +
                    "                          __/ |                              \n" +
                    "                         |___/                               ";

    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> distinctWords = new HashMap<>();//For each distinct word in the text calculate the number of occurrence.
        readFromFile("harry.txt",distinctWords);//Reading a text about Harry Potter.

        //1.4. Sort in the DESC mode by the number of occurrence..
        //1.5. Find  the first 20 pairs.
        final Map<String, Integer> sortedTwentyWords = distinctWords.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .limit(20)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //1.6  Find all the proper names
        List<String> properNames = new ArrayList<>();
        for (String key: distinctWords.keySet()){
            if (Character.isUpperCase(key.charAt(0))){
                if (!distinctWords.containsKey(key.toLowerCase())&& key.length()>3){
                    properNames.add(key);
                }
            }
        }
        
        //Count them and arrange in alphabetic order.
        Collections.sort(properNames);
        int properNamesCount = properNames.size();

        //1.8.  First 20 pairs and names write into to a file test.txt
        writeToFile("myHarryText.txt",fileHeader,sortedTwentyWords,properNames);

    }

    //@param fileName means new file name and path
    //@param header means pretty header for file
    //@param map for hash map of distinct words and counts
    //@param list for list of Proper names in the text
    public static void writeToFile(String fileName,String header, Map<String, Integer> map, List<String> list) throws FileNotFoundException, UnsupportedEncodingException {
        if (!fileName.equals("") && !fileName.equals(null) && !fileName.isEmpty() && fileName.contains(".")){ //correct file path check
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.println(header);
            writer.println("First 20 distinct words:");
            map.forEach((key, value) -> writer.println(key + " : " + value));
            writer.println("Proper names :");
            list.forEach(item -> writer.println(item));
            writer.close();
        }else{
            System.out.println("Write correct file path!");
        }
    }

    //@param path means path to text file
    //@param distinctWords means hashset of distinct words
    public static void readFromFile(String path, HashMap<String,Integer> distinctWords) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(path));
        String currentLine;
        while (scanner.hasNext()){
            currentLine = scanner.nextLine();
            if (currentLine.length()>0 && !currentLine.isEmpty() && !currentLine.equals("\n")) {
                String[] tmpWords = currentLine.replaceAll("[^a-zA-Z ]", "").split(" ");//Use RegEx.
                for (String item: tmpWords){
                    //--------------For each distinct word in the text calculate the number of occurrence. -------------
                    if (distinctWords.containsKey(item)){
                        distinctWords.replace(item,distinctWords.get(item).intValue(),distinctWords.get(item).intValue()+1);
                    }else{
                        if (item.length()>0)
                            distinctWords.put(item,1);
                    }
                }
            }
        }
    }

}
