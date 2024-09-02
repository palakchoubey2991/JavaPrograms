package Testing2;

public class fibonaci {
    public static void main(String args[])
    {
        int a1=1,a2=1,a3=1;
        int target=10;
        int i=1;
        System.out.println(a1);
        System.out.println(a2);
        while(i<=10)
        {
            int j=a2+a3;
            a2=a3;
            a3=j;
            System.out.println(j);
            i++;
        }
    }
}
