package src.core.OperatorsInJava;

public class BitwiseOperator {
    public static void main(String[] args) {
BitwiseOperator bitwiseOperator=new BitwiseOperator();
bitwiseOperator.bitwiseAndOperator();
bitwiseOperator.bitwiseOROperator();
    }

    //    bitwise AND	&
    public void bitwiseAndOperator() {
        /*
        The logical && operator doesn't check the second condition if the
        first condition is false. It checks the second condition only if
        the first one is true.
        The bitwise & operator always checks both conditions whether first condition is true or false.
        */
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a++ < c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a < b & a++ < c);//false && true = false
        System.out.println(a);//11 because second condition is checked
    }

    //    bitwise exclusive OR	^
    public void bitwiseOROperator() {
      /*  The logical || operator doesn't check the second condition if the first condition is true.
        It checks the second condition only if the first one is false.
        The bitwise | operator always checks both conditions whether first condition is true or false.*/
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c);//true || true = true
        System.out.println(a > b | a < c);//true | true = true
//  || vs |
        System.out.println(a > b || a++ < c);//true || true = true
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a > b | a++ < c);//true | true = true
        System.out.println(a);//11 because second condition is checked
    }

}
