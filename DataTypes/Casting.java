package DataTypes;

public class Casting {
    public static void main(String[] args) {
        // code for implicit conversion
        int a = 10;
        System.out.println("a value is\t" + a);
        float b = a;
        System.out.println("b value is\t" + b);
        // explicit conversion
        float c = 10.00f;
        System.out.println("float c value" + c);
        int d = (int)c;
        System.out.println("int d value" + d);
    }

}
