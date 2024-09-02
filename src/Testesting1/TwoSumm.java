package Testesting1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumm {
    public static void main(String args[])
    {
        int arr[]={1,2,4,6,8,2};
        int target=5;
        int [] index=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int remaining=target-arr[i];
            if(map.containsKey(remaining))
            {
                index[0]=map.get(remaining);
                index[1]=i;
            }
            else
                map.put(arr[i],i);
        }
        System.out.println(Arrays.toString(index));
    }
}
