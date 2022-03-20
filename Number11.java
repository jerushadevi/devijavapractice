import java.util.*;
class Number11
{
    public static void main(String abc[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            int rem=n%10;
               sum=rem+sum;
               n=n/10;
        
        }
        System.out.println(sum);
   
       
        
    }
}
