package Testing2;

import java.util.Arrays;

public class Rotation {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        int n=3;
        int i=1;
        while(i<=3)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

}
