package Testesting1;

public class FibonaciSeries {
    public static void main(String args[])
    {
        int num=10;
        for(int i=0;i<num;i++)
        {
            System.out.println(fibo(i));
        }

    }
    public static int fibo(int num)
    {
        if(num==0||num==1)
        {
            return num;
        }
        return fibo(num-1)+fibo(num-2);
    }
}
