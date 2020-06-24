package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

/*
 * @author Alexander Panyshchev
 * @since 6/24/20
 * @version 1.0
 *Task:
 * Create a class that manages logs in this file.
 */
public class LogParser {
    private String filePath;

    public LogParser(String filePath) {
        this.filePath = filePath;
    }

    public LogParser() {
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void extractToFile(String str, String pathToNewFile) throws IOException {
        if (!pathToNewFile.equals("") && !pathToNewFile.equals(null) && !pathToNewFile.isEmpty() && pathToNewFile.contains(".")){ //correct file path check
            System.out.println("File: "+ pathToNewFile+" starts at: "+ LocalDateTime.now());
            PrintWriter writer = new PrintWriter(pathToNewFile, "UTF-8");
            Files.lines(Paths.get(filePath)).filter(line -> line.contains(str)).forEach(item -> writer.println(item));
            writer.close();
            System.out.println("File: "+ pathToNewFile+" finished at: "+ LocalDateTime.now());
        }else{
            System.out.println("Write correct file path!");
        }
    }
}
