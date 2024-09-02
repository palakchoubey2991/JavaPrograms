package Testing2;

public class SecondHightest {
    public static void main(String args[])
    {

        int arr[]={10,40,30,60,90,100};
        int highest=0;
        int sec_highest=0;
        for(int i=0;i<arr.length;i++)
        { int temp=0;
            if(arr[i]>highest)
            {
                sec_highest=highest;
                highest=arr[i];

            }
            if(sec_highest>highest&&arr[i]>sec_highest)
            {
                sec_highest=highest;
                highest=arr[i];
            }
        }
        System.out.println("higest :"+highest);
        System.out.println("second Highest :"+sec_highest);

    }
}
