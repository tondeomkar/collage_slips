// Write a java program to display all the vowels from a given string
//import java.io.*; //15

public class Vowel 
{
  public static void main(String arg[])
  {
    String str = new String("Hi Welcome aeiou");
    for(int i = 0; i < str.length(); i++)
    {
        if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u')
        System.out.println("Given String contain " +str.charAt(i)+" at the index "+i);
    }
  }    
}
