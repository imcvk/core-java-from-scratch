package src.core.OperatorsInJava;

public class LogicalOperator {
    public static void main(String[] args) {
        LogicalOperator logicalOperator=new LogicalOperator();
        logicalOperator.logicalAndOperator();
        logicalOperator.logicalOROperator();
    }
    public void logicalAndOperator() {

        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a < b && a++ < c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }

    //    bitwise exclusive OR	^
    public void logicalOROperator() {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c);//true || true = true
        System.out.println(a > b || a++ < c);//true || true = true
        System.out.println(a);//10 because second condition is not checked

    }
}
