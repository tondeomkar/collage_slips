//package slip4.java;//15 Write a java program to display alternate character from a given string

import java.util.Scanner;

public class Altstr 
{
    public static void main(String[] a)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.nextLine();
        try
        {
            for(int i = 0; i <= str.length(); i=i+2)
            {
                System.out.println(str.charAt(i));
            }
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("string "+str.length());
        }
    }
    
}
