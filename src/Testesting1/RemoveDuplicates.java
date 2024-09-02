package Testesting1;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String args[])
    {
        String s="programming";
        String WD="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            boolean duplicate=false;
            for(int j=i+1;j<s.length();j++)
            {
                if(ch==s.charAt(j))
                        {
                            duplicate=true;
                            break;
                        }
            }
            if(!duplicate)
            {
                WD=WD+ch;
            }
        }
        System.out.println(WD);
    }
}
