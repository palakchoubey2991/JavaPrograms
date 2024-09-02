package Testesting1;

public class countthenumbfromstring {
    public static void main(String args[])
    {
        String s="a5b5c5d5";
        int n=0;
        String stringvalue="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                n=n+Character.getNumericValue(s.charAt(i));
            }
            else
                stringvalue=stringvalue+s.charAt(i);

        }
        System.out.println(n);
        System.out.println(stringvalue);

    }
}
