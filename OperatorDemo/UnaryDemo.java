package OperatorDemo;

public class UnaryDemo {
    public static void main(String[] args) {
        int a=10;
        //prefix increment
        System.out.println("origanal a value is\t"+a);
        System.out.println("after preincrement a value is\t"+(++a));
        System.out.println("updated value of a is\t"+a);
        System.out.println("----------------------------------------------------------------------");
        //postfix increment
        int b=10;
        System.out.println("origanal b value is\t"+b);
        System.out.println("after post increment b value is\t"+(b++));
        System.out.println("updated value is\t"+b);
        System.out.println("-----------------------------------------------------------------------");
        //prefix decrement
        int c=10;
        System.out.println("c value is\t"+c);
        System.out.println("after predecrement is \t"+(--c));
        System.out.println("updated c value is \t+c");
        System.out.println("--------------------------------------------------------------------------");
        //postfix decrement
        int d=10;
        System.out.println("org value of d is\t"+d);
        System.out.println("after post dec d is\t"+(d--));
        System.out.println("updated value is\t"+d);

        
    }
    
}
