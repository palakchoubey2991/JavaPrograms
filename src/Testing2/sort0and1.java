package Testing2;

public class sort0and1 {
    public static void main(String args[])
    {
        String s="1100011001100";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)=='0'))
            {
                s1=s.charAt(i)+s1;
            }
        }
        System.out.println("s1 value without zero : "+s1);
        int i=s1.length();
        while(i<s.length())
        {
            s1=s1+'0';
            i++;
        }
        System.out.println("s1 value after zero : "+s1);
    }
}
