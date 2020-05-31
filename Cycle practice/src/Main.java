public class Main {
    public static void main(String[] args) {
        String name = "Alex";//8 fackts about me
        byte age = 22;
        short weight = 93;
        int height = 182;
        long birthYear = 1998;
        float myFavoriteNumber = 7;
        double myMostHatedNumber = 2;
        boolean isIKnowJava = true;
        char myNamesFirstChar = "A".charAt(0);

        System.out.println(String.format("Hi, my name is %s,my age is %s, my weight is %s, my height is %s, i was borned at %s year, my favorite number is %s, my most hated number is %s, you can ask me, do i know java, and i can say %s, as you know my first names char is %s",name,age, weight,height,birthYear,myFavoriteNumber,myMostHatedNumber, isIKnowJava?"Yes":"No",myNamesFirstChar));


        String[] quialities = {"Alex", "22 years old", "UzNU student", "93 kg",
                "genius", "billionaire", "playboy", "philanthropist"};
        System.out.print("Hi! ");

        for (int i = 0;i<quialities.length;i++){//more facts)
            if (i<4) {
                System.out.println("I'm " + quialities[i]);
            }else if( i==4) {
                System.out.print("And without suite ");
                System.out.print("I'm " + quialities[i]+", ");
            }else{
                System.out.print(quialities[i]+", ");
            }
        }//ok enough fackts
        System.out.println();
        System.out.println(isPalindrome("abda")?"Its palindrome!":"No, its not palindrome :(");//Check words "abda" for palindrome
        System.out.println("----------------------Area limited by functions---------------");
        for (float x = 0; x<=3.14;x+=0.01){//Here the points which contains in area
            float y = (float) Math.sin(x);
            if (y>= 0.1*2){
                System.out.println("X: "+ x + ", Y: "+y);
            }
        }
    }

    static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }//Function for checking palindrome
}
