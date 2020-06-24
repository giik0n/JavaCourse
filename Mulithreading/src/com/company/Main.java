package com.company;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/*
 * @author Alexander Panyshchev
 * @since 6/24/20
 * @version 1.0
 *Task:
 *  1. Use the file from the previous task  - logs.txt.
    2. Create a class that manages logs in this file.
    3. Create a method that finds all the ERROR logs  for a specific date and write them into a specific file (name = ERROR  + Date  + .log)
    4. In your main class develop a functionality to create  5 such a files for 5 different days. Launch them in consistent way (one after another ).
    5. Repeat the above  task in parallel way. Multi-threading.
    6. Compare the results.
 */

public class Main {
        static String file = "logs.txt";
    public static void main(String[] args) throws IOException {
        LogParser parser = new LogParser(file);
        LocalDateTime oneThreadStart = LocalDateTime.now();
        parser.extractToFile("2019-10-15","ERROR2019-10-15.txt");
        parser.extractToFile("2019-10-16","ERROR2019-10-16.txt");
        parser.extractToFile("2019-10-17","ERROR2019-10-17.txt");
        parser.extractToFile("2019-10-18","ERROR2019-10-18.txt");
        parser.extractToFile("2019-10-19","ERROR2019-10-19.txt");
        LocalDateTime oneThreadFinish = LocalDateTime.now();
        System.out.println("One thread time: "+ ChronoUnit.MILLIS.between(oneThreadStart,oneThreadFinish)+"ms");

        LocalDateTime multiThreadStart = LocalDateTime.now();
        MyThread t1 = new MyThread(file,"2019-10-20");
        t1.start();
        MyThread t2 = new MyThread(file,"2019-10-21");
        t2.start();
        MyThread t3 = new MyThread(file,"2019-10-22");
        t3.start();
        MyThread t4 = new MyThread(file,"2019-10-23");
        t4.start();
        MyThread t5 = new MyThread(file,"2019-10-25");
        t5.start();
        LocalDateTime multiThreadFinish = LocalDateTime.now();
        while(t1.isAlive() || t2.isAlive() || t3.isAlive() ||  t4.isAlive() ||  t5.isAlive()){
            multiThreadFinish = LocalDateTime.now();

        }
        System.out.println("Multi threads time: "+ ChronoUnit.MILLIS.between(multiThreadStart,multiThreadFinish)+"ms");

    }

    static class MyThread extends Thread{
        private String filePath;
        private String date;

        public MyThread(String filePath, String date) {
            this.filePath = filePath;
            this.date = date;
        }

        @Override
        public void run() {
            LogParser parser = new LogParser(filePath);
            try {
                parser.extractToFile(date,"ERROR"+String.valueOf(date)+".txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //------------My Output----------------
    //File: ERROR2019-10-15.txt starts at: 2020-06-24T17:36:47.272
    //File: ERROR2019-10-15.txt finished at: 2020-06-24T17:36:49.439
    //File: ERROR2019-10-16.txt starts at: 2020-06-24T17:36:49.439
    //File: ERROR2019-10-16.txt finished at: 2020-06-24T17:36:50.917
    //File: ERROR2019-10-17.txt starts at: 2020-06-24T17:36:50.918
    //File: ERROR2019-10-17.txt finished at: 2020-06-24T17:36:52.122
    //File: ERROR2019-10-18.txt starts at: 2020-06-24T17:36:52.122
    //File: ERROR2019-10-18.txt finished at: 2020-06-24T17:36:53.001
    //File: ERROR2019-10-19.txt starts at: 2020-06-24T17:36:53.001
    //File: ERROR2019-10-19.txt finished at: 2020-06-24T17:36:53.859
    //One thread time: 6604ms
    //File: ERROR2019-10-20.txt starts at: 2020-06-24T17:36:53.863
    //File: ERROR2019-10-22.txt starts at: 2020-06-24T17:36:53.863
    //File: ERROR2019-10-21.txt starts at: 2020-06-24T17:36:53.863
    //File: ERROR2019-10-23.txt starts at: 2020-06-24T17:36:53.865
    //File: ERROR2019-10-25.txt starts at: 2020-06-24T17:36:53.865
    //File: ERROR2019-10-20.txt finished at: 2020-06-24T17:36:56.636
    //File: ERROR2019-10-23.txt finished at: 2020-06-24T17:36:56.646
    //File: ERROR2019-10-25.txt finished at: 2020-06-24T17:36:56.648
    //File: ERROR2019-10-22.txt finished at: 2020-06-24T17:36:56.651
    //File: ERROR2019-10-21.txt finished at: 2020-06-24T17:36:56.652
    //Multi threads time: 2790ms
}
