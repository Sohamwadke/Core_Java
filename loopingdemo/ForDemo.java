package loopingdemo;

/**
 * ForDemo
 */
public class ForDemo {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) 
        {

            if (i % 2 == 0) {
                System.err.printf("the number%d is even\n", i);

            }
            else
            {
                System.err.printf("the number %d is odd",i);
            }

        }

    }
}