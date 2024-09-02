package Testesting1;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String args[])
    {
        try{
            int data=1/0;
        }
        catch(Error e)
        {
            System.out.println("Exception handled");
        }


    }
}
