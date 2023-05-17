package corejavac2tc;

public class TypecastingEx {
    public static void main(String[] args) {
        int myInt = 42;
        double myDouble = 3.14;
        double result1 = myInt;
        int result2 = (int) myDouble;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
