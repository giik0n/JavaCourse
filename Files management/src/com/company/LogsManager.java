package com.company;
/*
 * @author Alexander Panyshchev
 * @since 6/21/20
 * @version 1.0
 * Class for managing logs files
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


public class LogsManager {

    private String filePath;// Path to logs file

    public LogsManager(String filePath) {
        this.filePath = filePath;
    }

    public LogsManager() {
    }

    //@return Logs file path
    public String getFilePath() {
        return filePath;
    }

    //@param Path to logs file in String format
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    //method extractToFile creates new file with specified logs
    //@param str means parameter for filtering
    //@param pathToNewFile means path for creation new logs file
    public void extractToFile(String str, String pathToNewFile) throws IOException {
        if (!pathToNewFile.equals("") && !pathToNewFile.equals(null) && !pathToNewFile.isEmpty() && pathToNewFile.contains(".")){ //correct file path check
            PrintWriter writer = new PrintWriter(pathToNewFile, "UTF-8");
            Files.lines(Paths.get(filePath)).filter(line -> line.contains(str)).forEach(item -> writer.println(item));
            writer.close();
                    /* This variant needs really big RAM size
                    String stringToWrite = "";
                    ArrayList<String> lines = new ArrayList<>(Files.lines(Paths.get(filePath)).filter(line -> line.contains(date)).collect(Collectors.toList()));
                    for (String line:lines){
                        stringToWrite += line + System.lineSeparator();
                    }
                    Files.write(Paths.get(pathToNewFile), stringToWrite.getBytes());*/
        }else{
            System.out.println("Write correct file path!");
        }
    }

    //@param warningType means type of needed warning
    //@param pathToNewFile means path for creation new logs file
    public void extractToFile(WarningType warningType, String pathToNewFile) throws IOException {
        if (!pathToNewFile.equals("") && !pathToNewFile.equals(null) && !pathToNewFile.isEmpty()  && pathToNewFile.contains(".")){ //correct file path check
            PrintWriter writer = new PrintWriter(pathToNewFile, "UTF-8");
            Files.lines(Paths.get(filePath)).filter(line -> line.contains(warningType.toString())).forEach(item -> writer.println(item));
            writer.close();
        }else{
            System.out.println("Write correct file path!");
        }
    }

    //method countLogs counting all lines in file
    public long countLogs(){
        long count = 0;
        try {
            count = Files.lines(Paths.get(filePath)).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    //this method counts logs lines by Files.lines method
    //@param warningType means type of needed warning
    public long countLogs(WarningType warningType){
        long count = 0;
        try {
            count = Files.lines(Paths.get(filePath)).filter(item -> item.contains(warningType.toString())).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    //this method counts logs lines by String.split method
    //@param warningType means type of needed warning
    public long countLogsOldMethod(WarningType warningType){
        long count = 0;
        try {
            String text = new String(Files.readAllBytes(Paths.get(filePath)));
            String[] array = text.split("\\n");
            for (int i = 0; i < array.length; i++) {
                if (array[i].contains(warningType.toString())){
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

}
