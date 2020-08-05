package pan.edu;

public class BooleanOperation {
    private Boolean firstOne;
    private Boolean secondOne;

    public BooleanOperation(Boolean firstOne, Boolean secondOne) {
        this.firstOne = firstOne;
        this.secondOne = secondOne;
    }

    public Boolean conjunction(){
        if (firstOne == null||secondOne == null) return null;
            return this.firstOne&&this.secondOne;
    }
    public Boolean disjunction(){
        if (this.firstOne == null) return this.secondOne;
        if (this.secondOne == null) return this.firstOne;
        return this.firstOne||this.secondOne;
    }

    public BooleanOperation() {
    }

    public boolean isFirstOne() {
        return firstOne;
    }

    public void setFirstOne(Boolean firstOne) {
        this.firstOne = firstOne;
    }

    public boolean isSecondOne() {
        return secondOne;
    }

    public void setSecondOne(Boolean secondOne) {
        this.secondOne = secondOne;
    }
}
