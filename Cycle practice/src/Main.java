public class Main {
    public static void main(String[] args) {
        String[] quialities = {"Alex", "22 years old", "UzNU student", "93 kg",
                "genius", "billionaire", "playboy", "philanthropist"};
        System.out.print("Hi! ");

        for (int i = 0;i<quialities.length;i++){
            if (i<4) {
                System.out.println("I'm " + quialities[i]);
            }else if( i==4) {
                System.out.print("And without suite ");
                System.out.print("I'm " + quialities[i]+", ");
            }else{
                System.out.print(quialities[i]+", ");
            }
        }
        System.out.println();
        System.out.println(isPalindrome("abda")?"Its palindrome!":"No, its not:(");
        System.out.println("----------------------Area limited by functions---------------");
        for (float x = 0; x<=3.14;x+=0.01){
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
    }
}
