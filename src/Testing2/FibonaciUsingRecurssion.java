package Testing2;

public class FibonaciUsingRecurssion {
    public static void main(String args[])
    {
        int n=10;
        for(int i=1;i<=n;i++)
        {
            System.out.println(fib(i));

        }
    }
    public static int fib(int num)
    {
        if(num==1|| num==2)
        {
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }
}
