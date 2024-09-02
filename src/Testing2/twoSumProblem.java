package Testing2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumProblem {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,7};
        int target=7;
        Map<Integer,Integer> map=new HashMap<>();
        int arr1[]=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            int remaining=target-arr[i];
            if(map.containsKey(remaining))
            {
                arr1[0]=map.get(remaining);
                arr1[1]=i;

            }
            else
                map.put(arr[i],i);
        }
        System.out.println(Arrays.toString(arr1));

    }
}
