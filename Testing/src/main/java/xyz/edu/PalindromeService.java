package xyz.edu;

/*
 * @author Alexander Panyshchev
 * @since 8/7/20
 * @version 1.0
 *Task: Create and test palindrome service
 */

public class PalindromeService {
    private String string;
    private static final String regex = "[^a-zA-Zа-я]";
    public PalindromeService(String string) {
        this.string = string;
    }

    public PalindromeService() {
    }

    //@return checking if string is palindrome
    public static boolean isValid(String string) {
        return new PalindromeService(string).isValid();
    }
    //------------Getters/Setters------------------
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    //------------Getters/Setters------------------

    //Method set string to lower case
    private void toLowerCase(){
       setString(this.string.toLowerCase());
    }

    //Method cleanning string by regex
    public void CleanString(){
        setString( this.string.replaceAll(regex,""));
    }

    //@return new reversed string
    public String getReversed(){
        return new StringBuilder(string).reverse().toString();
    }

    //Static method
    // @return checking if string is palindrome
    public boolean isValid(){
        toLowerCase();
        CleanString();
        return this.getString().equals(this.getReversed());
    }
}
