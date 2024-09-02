package Testing2;

public class ReverseTheString {
    public static void main(String args[])
    {
        String s="palak choubey";
        String s1[]=s.split(" ");
        String reverseString="";
        for(int i=0;i<s1.length;i++)
        {
            String rev=s1[i];
            String r1="";
            for(int j=0;j<rev.length();j++)
            {
                r1=rev.charAt(j)+r1;

            }
            reverseString=reverseString+" "+r1;
        }
        System.out.println(reverseString);
    }
}
