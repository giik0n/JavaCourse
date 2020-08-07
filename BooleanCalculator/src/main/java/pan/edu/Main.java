package pan.edu;

/*
 * @author Alexander Panyshchev
 * @since 8/7/20
 * @version 1.0
 * Boolean Operations
 */

public class Main {
    public static void main(String[] args) {
        BooleanOperation booleanOperation = new BooleanOperation(null,null);
        System.out.println(booleanOperation.conjunction());
        System.out.println(booleanOperation.disjunction());
    }
}
