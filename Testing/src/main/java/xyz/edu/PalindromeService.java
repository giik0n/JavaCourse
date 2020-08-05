package xyz.edu;

public class PalindromeService {
    private String string;
    private static final String regex = "[^a-zA-Z]";
    public PalindromeService(String string) {
        this.string = string;
    }

    public PalindromeService() {
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

    private void getCleanedString(){
        setString( this.string.replaceAll(regex,""));
    }

    private String getReversed(){
        return new StringBuilder(string).reverse().toString();
    }

    public boolean isValid(){
        toLowerCase();
        getCleanedString();
        return this.getString().equals(this.getReversed());
    }
}
