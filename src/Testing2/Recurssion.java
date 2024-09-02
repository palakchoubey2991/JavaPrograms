package Testing2;

public class Recurssion {
    public static void main(String args[])
    {
        int num=5;
        int fact1=fact(num);
        System.out.println(fact1);

    }
    public static int fact(int num)
    {
        int fact1=0;
        if(num==1)
        {
            return 1;
        }
        return num*fact(num-1);
    }

}
