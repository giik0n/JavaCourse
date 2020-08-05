package pan.edu;

public class BooleanOperation {
    private Boolean firstOne;
    private Boolean secondOne;

    public BooleanOperation(boolean firstOne, boolean secondOne) {
        this.firstOne = firstOne;
        this.secondOne = secondOne;
    }

    public boolean conjunction(){
        boolean result = false;
        if (firstOne&&secondOne){
            result = true;
        }
        if (firstOne==false ){
            result = true;
        }
        return result;
    }

    public BooleanOperation() {
    }

    public boolean isFirstOne() {
        return firstOne;
    }

    public void setFirstOne(boolean firstOne) {
        this.firstOne = firstOne;
    }

    public boolean isSecondOne() {
        return secondOne;
    }

    public void setSecondOne(boolean secondOne) {
        this.secondOne = secondOne;
    }
}
