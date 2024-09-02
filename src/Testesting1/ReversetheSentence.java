package Testesting1;

public class ReversetheSentence {
    public static void main(String args[])
    {
        String sent="palak is my name";
        String s[]=sent.split(" ");
        String rev="";
        String catch1="";
        String f="";
        for(int i=0;i<s.length;i++)
        {
            catch1=s[i];
            for(int j=0;j<catch1.length();j++)
            {
                rev=catch1.charAt(i)+rev;
            }

            f=rev+" "+f;
        }
        System.out.println(f);
    }
}
