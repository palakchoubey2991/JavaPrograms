package Testesting1;

public class ReveseTheString {
    public static void main(String args[])
    {
        String s="palak";
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            rev=s.charAt(i)+rev;

        }
        System.out.println(rev);
    }
}
