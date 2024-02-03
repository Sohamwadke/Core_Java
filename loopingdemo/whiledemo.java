package loopingdemo;

public class whiledemo {
    public static void main(String[] args) {
        int i=1;
        while(i<=100)
        {
            if(i%2==0)
            {
                System.out.printf("the given %d is even",i);
            }
            else
            {
                System.out.printf("the given %d is odd",i);
            }
            i++;
        
        }
    }
}
