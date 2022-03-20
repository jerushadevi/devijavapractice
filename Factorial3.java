import java.util.*;
public class Factorial3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
            
            
        }
        System.out.println("factorial of the number:"+fact);
    }
}
