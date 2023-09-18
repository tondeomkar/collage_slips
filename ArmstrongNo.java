//Write a ‘java’ program to check whether given number is Armstrong or not.(Use static keyword)


//package slip3.java;//15


import java.util.Scanner;

public class ArmstrongNo {
    static int num, temp, res = 0, rem;
    public static void main (String[] a)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        num = scan.nextInt();
        temp = num;
        while(temp != 0)
        {
            rem = temp % 10;
            res = res + (rem * rem * rem);
            temp = temp/10;
        }
        if(num == res)
        {
            System.out.println("Number Armstrong ");
        }
        else
        {
            System.out.println("Number is not Armstrong ");
        }
    }
}
