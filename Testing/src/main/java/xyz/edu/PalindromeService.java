package xyz.edu;

public class PalindromeService {
    private String string;
    private static final String regex = "[^a-zA-Zа-я]";
    public PalindromeService(String string) {
        this.string = string;
    }

    public PalindromeService() {
    }

    public static boolean isValid(String string) {
        return new PalindromeService(string).isValid();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private void toLowerCase(){
       setString(this.string.toLowerCase());
    }

    public void getCleanedString(){
        setString( this.string.replaceAll(regex,""));
    }

    public String getReversed(){
        return new StringBuilder(string).reverse().toString();
    }

    public boolean isValid(){
        toLowerCase();
        getCleanedString();
        return this.getString().equals(this.getReversed());
    }
}
