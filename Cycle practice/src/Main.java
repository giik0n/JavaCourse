public class Main {
    public static void main(String[] args) {

        /*
        * @author Alexander Panishchev
        *Task:
        * 1. Write to console 8 facts about yourself using primitive types. (2 points)
          2.  Check a string as a palindrome ( 2 points)
          3.  Get the area limited by the following functions   x = 0 .. 3.14;
              y = sin(x);
              y = 0.1 * k, where k is the last cipher in your student card; (2 points)
        *
        * */
//-----------------------8 facts about me------------------------
        String name = "Alex";
        byte age = 22;
        short weight = 93;
        int height = 182;
        long birthYear = 1998;
        float myFavoriteNumber = 7;
        double myMostHatedNumber = 2;
        boolean isIKnowJava = true;
        char myNamesFirstChar = "A".charAt(0);
        String aboutMe = String.format("Hi, my name is %s,my age is %s, my weight is %s, my height is %s, i was borned at %s year, my favorite number is %s, my most hated number is %s, you can ask me, do i know java, and i can say %s, as you know my first names char is %s", name, age, weight, height, birthYear, myFavoriteNumber, myMostHatedNumber, isIKnowJava ? "Yes" : "No", myNamesFirstChar);
        System.out.println(aboutMe);
        System.out.println("Length: "+aboutMe.length());



//-------------------------Checking for palindrome-----------------------
        String sentence = "Hello, olleH";
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");//Cleaning the sentence from a punctuation signs.
        System.out.println(isPalindrome(sentence) ? "Its palindrome!" : "No, its not palindrome :(");//Check sentence for palindrome



//-------------------------Calculating Area-----------------------
        System.out.println("Total Area: "+calculatingArea(0.01,0.2));
    }

    static boolean isPalindrome(String str){//Function for check palindrome
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static double calculatingArea(double deltaX, double y){//function for calculating area by functions
        double totalArea = 0;
        double tmpArea;

            for (double x = 0; x < Math.PI; x+=deltaX) {
                if (Math.sin(x) < y){
                    tmpArea = Math.sin(x) * deltaX;
                } else {
                    tmpArea = y * deltaX;
                }
                totalArea += tmpArea;
            }
        return totalArea;
    }
}

