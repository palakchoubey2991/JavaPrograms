package Testesting1;

public class SOrt01 {
    public static void main(String args[])
    {
        String s="110011001100";
        String sort="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                sort=sort+s.charAt(i);
            }
        }
        int i=sort.length();
        while(i<s.length())
        {
            sort=sort+'0';
            i++;
        }
        System.out.println(sort);
        System.out.println("s length :"+s.length());
        System.out.println("sort length :"+sort.length());
    }
}
