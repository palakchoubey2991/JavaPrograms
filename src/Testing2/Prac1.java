package Testing2;

public class Prac1 {
    public static void main(String args[])
    {
      int n=10;
      for(int i=1;i<=10;i++)
      {
          System.out.println(fibo(i));
      }

    }
    public static int fibo(int n)
    {
        if(n==0||n==1)
        {
            return n;

        }
        return fibo(n-1)+fibo(n-2);
    }
}