package Testing2;

public class StringIntSum {
    public static void main(String args[])
    {
        String s="abc3b4h3";
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                sum=Character.getNumericValue(s.charAt(i))+sum;
            }
        }
        System.out.println(sum);
    }
}
