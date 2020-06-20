package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


   /*
        * @author Alexander Panyshchev
        * @version 2020-06-20
        * JavaCollectionsFramework. List. (4 points)
        *Task:
        * 1.  Create ArrayList and LinkedList containing  10 000 Integer elements. Compare time intervals.
          2. Insert  new 100 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
          3. Update 100 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
          4. Delete 100 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
        *Computer Params:
        *  1. Processor = 2,3 GHz Intel Core i5
        *  2. RAM = 8 ГБ 2133 MHz LPDDR3
        * */

public class Main {

    public static void main(String[] args) {
        System.out.println("------------Lists Initialization--------------");
        //------------ArrayList Initialization-------------------
        LocalDateTime arrayListInitStart = LocalDateTime.now();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        LocalDateTime arrayListInitFinish = LocalDateTime.now();
        System.out.println("ArrayList initialization needs: "
                +ChronoUnit.MILLIS.between(arrayListInitStart, arrayListInitFinish)
                +" Milliseconds");


        //------------LinkedList Initialization-------------------
        LocalDateTime linkedListInitStart = LocalDateTime.now();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        LocalDateTime linkedListInitFinish = LocalDateTime.now();
        System.out.println("LinkedList initialization needs: "
                +ChronoUnit.MILLIS.between(linkedListInitStart, linkedListInitFinish)
                +" Milliseconds");


        //------------Insert  new 100 elements  on the  beginning--------------
        System.out.println("\n------------Insert  new 100 elements  on the  beginning--------------");
        LocalDateTime arrayListBeginInsertionStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i,i);
        }
        LocalDateTime arrayListBeginInsertionFinish = LocalDateTime.now();
        System.out.println("ArrayList adding 100 elements to start needs: "
                +ChronoUnit.MILLIS.between(arrayListBeginInsertionStart, arrayListBeginInsertionFinish)
                +" Milliseconds");

        LocalDateTime linkedListBeginInsertionStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i,i);
        }
        LocalDateTime linkedListBeginInsertionFinish = LocalDateTime.now();
        System.out.println("LinkedList adding 100 elements to start needs: "
                +ChronoUnit.MILLIS.between(linkedListBeginInsertionStart, linkedListBeginInsertionFinish)
                +" Milliseconds");

        //------------Insert  new 100 elements  on the  middle--------------
        System.out.println("\n------------Insert  new 100 elements  on the  middle--------------");
        LocalDateTime arrayListMiddleInsertionStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            arrayList.add(5050+ i,i);
        }
        LocalDateTime arrayListMiddleInsertionFinish = LocalDateTime.now();
        System.out.println("ArrayList adding 100 elements to middle needs: "
                +ChronoUnit.MILLIS.between(arrayListMiddleInsertionStart, arrayListMiddleInsertionFinish)
                +" Milliseconds");

        LocalDateTime linkedListMiddleInsertionStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            linkedList.add(5050 + i,i);
        }
        LocalDateTime linkedListMiddleInsertionFinish = LocalDateTime.now();
        System.out.println("LinkedList adding 100 elements to middle needs: "
                +ChronoUnit.MILLIS.between(linkedListMiddleInsertionStart, linkedListMiddleInsertionFinish)
                +" Milliseconds");

        //------------Insert  new 100 elements  on the  end--------------
        System.out.println("\n------------Insert  new 100 elements  on the  end--------------");
        LocalDateTime arrayListEndInsertionStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        LocalDateTime arrayListEndInsertionFinish = LocalDateTime.now();
        System.out.println("ArrayList adding 100 elements to end needs: "
                +ChronoUnit.MILLIS.between(arrayListEndInsertionStart, arrayListEndInsertionFinish)
                +" Milliseconds");

        LocalDateTime linkedListEndInsertionStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
        }
        LocalDateTime linkedListEndInsertionFinish = LocalDateTime.now();
        System.out.println("LinkedList adding 100 elements to end needs: "
                +ChronoUnit.MILLIS.between(linkedListEndInsertionStart, linkedListEndInsertionFinish)
                +" Milliseconds");





        //------------Update  100 elements  on the  beginning--------------
        System.out.println("\n------------Update  100 elements  on the  beginning--------------");
        LocalDateTime arrayListBeginUpdateStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            arrayList.set(i,i+5);
        }
        LocalDateTime arrayListBeginUpdateFinish = LocalDateTime.now();
        System.out.println("ArrayList updating 100 elements on start needs: "
                +ChronoUnit.MILLIS.between(arrayListBeginUpdateStart, arrayListBeginUpdateFinish)
                +" Milliseconds");

        LocalDateTime linkedListBeginUpdateStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            linkedList.set(i,i);
        }
        LocalDateTime linkedListBeginUpdateFinish = LocalDateTime.now();
        System.out.println("LinkedList updating 100 elements on start needs: "
                +ChronoUnit.MILLIS.between(linkedListBeginUpdateStart, linkedListBeginUpdateFinish)
                +" Milliseconds");

        //------------Update 100 elements  on the  middle--------------
        System.out.println("\n------------Update 100 elements  on the  middle--------------");
        LocalDateTime arrayListMiddleUpdateStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            arrayList.set(5000+ i,i+5);
        }
        LocalDateTime arrayListMiddleUpdateFinish = LocalDateTime.now();
        System.out.println("ArrayList updating 100 elements on middle needs: "
                +ChronoUnit.MILLIS.between(arrayListMiddleUpdateStart, arrayListMiddleUpdateFinish)
                +" Milliseconds");

        LocalDateTime linkedListMiddleUpdateStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            linkedList.set(5000 + i,i+5);
        }
        LocalDateTime linkedListMiddleUpdateFinish = LocalDateTime.now();
        System.out.println("LinkedList updating 100 elements on middle needs: "
                +ChronoUnit.MILLIS.between(linkedListMiddleUpdateStart, linkedListMiddleUpdateFinish)
                +" Milliseconds");

        //------------Update 100 elements  on the  end--------------
        System.out.println("\n------------Update 100 elements  on the  end--------------");
        LocalDateTime arrayListEndUpdateStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            arrayList.set(arrayList.size()-100+i,i+5);
        }
        LocalDateTime arrayListEndUpdateFinish = LocalDateTime.now();
        System.out.println("ArrayList updating 100 elements on end needs: "
                +ChronoUnit.MILLIS.between(arrayListEndUpdateStart, arrayListEndUpdateFinish)
                +" Milliseconds");

        LocalDateTime linkedListEndUpdateStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            linkedList.set(linkedList.size()-100+i,i+5);
        }
        LocalDateTime linkedListEndUpdateFinish = LocalDateTime.now();
        System.out.println("LinkedList updating 100 elements on end needs: "
                +ChronoUnit.MILLIS.between(linkedListEndUpdateStart, linkedListEndUpdateFinish)
                +" Milliseconds");




        //------------Remove  100 elements  on the  beginning--------------
        System.out.println("\n------------Remove  100 elements  on the  beginning--------------");
        LocalDateTime arrayListBeginRemoveStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            arrayList.remove(i);
        }
        LocalDateTime arrayListBeginRemoveFinish = LocalDateTime.now();
        System.out.println("ArrayList removing 100 elements on start needs: "
                +ChronoUnit.MILLIS.between(arrayListBeginRemoveStart, arrayListBeginRemoveFinish)
                +" Milliseconds");

        LocalDateTime linkedListBeginRemoveStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            linkedList.remove(i);
        }
        LocalDateTime linkedListBeginRemoveFinish = LocalDateTime.now();
        System.out.println("LinkedList removing 100 elements on start needs: "
                +ChronoUnit.MILLIS.between(linkedListBeginRemoveStart, linkedListBeginRemoveFinish)
                +" Milliseconds");

        //------------Remove 100 elements  on the  middle--------------
        System.out.println("\n------------Remove 100 elements  on the  middle--------------");
        LocalDateTime arrayListMiddleRemoveStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            arrayList.remove(5000+ i);
        }
        LocalDateTime arrayListMiddleRemoveFinish = LocalDateTime.now();
        System.out.println("ArrayList removing 100 elements on middle needs: "
                +ChronoUnit.MILLIS.between(arrayListMiddleRemoveStart, arrayListMiddleRemoveFinish)
                +" Milliseconds");

        LocalDateTime linkedListMiddleRemoveStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            linkedList.remove(5000 + i);
        }
        LocalDateTime linkedListMiddleRemoveFinish = LocalDateTime.now();
        System.out.println("LinkedList removing 100 elements on middle needs: "
                +ChronoUnit.MILLIS.between(linkedListMiddleRemoveStart, linkedListMiddleRemoveFinish)
                +" Milliseconds");

        //------------Remove 100 elements  on the  end--------------
        System.out.println("\n------------Remove 100 elements  on the  end--------------");
        LocalDateTime arrayListEndRemoveStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            arrayList.remove(arrayList.size()-100+i);
        }
        LocalDateTime arrayListEndRemoveFinish = LocalDateTime.now();
        System.out.println("ArrayList removing 100 elements on end needs: "
                +ChronoUnit.MILLIS.between(arrayListEndRemoveStart, arrayListEndRemoveFinish)
                +" Milliseconds");

        LocalDateTime linkedListEndRemoveStart = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            linkedList.remove(linkedList.size()-100+i);
        }
        LocalDateTime linkedListEndRemoveFinish = LocalDateTime.now();
        System.out.println("LinkedList removing 100 elements on end needs: "
                +ChronoUnit.MILLIS.between(linkedListEndRemoveStart, linkedListEndRemoveFinish)
                +" Milliseconds");


        //-------------------------MyOutput---------------------------
        /*
        ------------Lists Initialization--------------
        ArrayList initialization needs: 16 Milliseconds
        LinkedList initialization needs: 2 Milliseconds

        ------------Insert  new 100 elements  on the  beginning--------------
        ArrayList adding 100 elements to start needs: 1 Milliseconds
        LinkedList adding 100 elements to start needs: 0 Milliseconds

        ------------Insert  new 100 elements  on the  middle--------------
        ArrayList adding 100 elements to middle needs: 0 Milliseconds
        LinkedList adding 100 elements to middle needs: 3 Milliseconds

        ------------Insert  new 100 elements  on the  end--------------
        ArrayList adding 100 elements to end needs: 0 Milliseconds
        LinkedList adding 100 elements to end needs: 0 Milliseconds

        ------------Update  100 elements  on the  beginning--------------
        ArrayList updating 100 elements on start needs: 1 Milliseconds
        LinkedList updating 100 elements on start needs: 0 Milliseconds

        ------------Update 100 elements  on the  middle--------------
        ArrayList updating 100 elements on middle needs: 0 Milliseconds
        LinkedList updating 100 elements on middle needs: 2 Milliseconds

        ------------Update 100 elements  on the  end--------------
        ArrayList updating 100 elements on end needs: 0 Milliseconds
        LinkedList updating 100 elements on end needs: 1 Milliseconds

        ------------Remove  100 elements  on the  beginning--------------
        ArrayList removing 100 elements on start needs: 0 Milliseconds
        LinkedList removing 100 elements on start needs: 0 Milliseconds

        ------------Remove 100 elements  on the  middle--------------
        ArrayList removing 100 elements on middle needs: 1 Milliseconds
        LinkedList removing 100 elements on middle needs: 3 Milliseconds

        ------------Remove 100 elements  on the  end--------------
        ArrayList removing 100 elements on end needs: 0 Milliseconds
        LinkedList removing 100 elements on end needs: 0 Milliseconds
        */
    }
}
