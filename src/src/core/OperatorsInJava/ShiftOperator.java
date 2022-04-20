package src.core.OperatorsInJava;

public class ShiftOperator {
    public static void main(String[] args) {
        ShiftOperator shiftOperator = new ShiftOperator();
        shiftOperator.leftShift();
        shiftOperator.rightShift();
    }

    //    The Java left shift operator << is used to shift
//    all the bits in a value to the left side of a specified number of times.
    public void leftShift() {
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println(20 << 2);//20*2^2=20*4=80
        System.out.println(15 << 4);//15*2^4=15*16=240
    }

    //    The Java right shift operator >> is used to move the value of the left operand to right
    //    by the number of bits specified by the right operand.
    public void rightShift() {
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2
    }
}
