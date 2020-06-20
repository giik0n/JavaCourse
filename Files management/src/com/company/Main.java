package com.company;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/*
 * @author Alexander Panyshchev
 * @since 6/21/20
 * @version 1.0
 *Task:
 *  1. Parse the file logs.txt (see the attachment).  Extract to a separate file all the logs from October 2019.
    2. Calculate the total number of logs (lines).
    3. Calculate the total  number of  ERROR logs. Use previous skills - String.split
    4. Calculate the total number of ERROR logs. Use Files.lines.
    5. Compare two results.
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {
        LogsManager logsManager = new LogsManager("logs.txt");

        logsManager.extractToFile("2019-10","octoberLogs.txt");//(1) Creating new file

        System.out.println("Total logs: " + logsManager.countLogs());//(2) Counting total number of logs

        //------------Counting ERROR Logs by 2 methods-----------------
        LocalDateTime startNewMethod = LocalDateTime.now();
        long logsCount = logsManager.countLogs(WarningType.ERROR);//(4)
        LocalDateTime finishNewMethod = LocalDateTime.now();
        System.out.println("Counted: "+logsCount + " "+WarningType.ERROR+" logs");
        System.out.println("Time for Files.lines method: "+ ChronoUnit.MILLIS.between(startNewMethod,finishNewMethod) + " milliseconds");
        System.out.println("-------------------------------");

        LocalDateTime startOldMethod = LocalDateTime.now();
        long logsCountOldMethod = logsManager.countLogsOldMethod(WarningType.ERROR);//(3)
        LocalDateTime finishOldMethod = LocalDateTime.now();
        System.out.println("Counted: "+logsCountOldMethod + " "+WarningType.ERROR+" logs");
        System.out.println("Time for String.split method: "+ ChronoUnit.MILLIS.between(startOldMethod,finishOldMethod) + " milliseconds");


        //-----Output-----
        //Counted: 361 logs (5)
        //Time for Files.lines method: 1446 milliseconds
        //-------------------------------
        //Counted: 361 logs
        //Time for String.split method: 6109 milliseconds
    }
}
