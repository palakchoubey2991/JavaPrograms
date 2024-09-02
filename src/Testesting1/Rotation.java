package Testesting1;

import java.util.Arrays;

public class Rotation {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        int n=3;
        int j=1;
        while(j<=n) {
            for (int i = 0; i <arr.length-1; i++) {
                 int temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;

            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
