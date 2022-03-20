import java.util.*;
class Count
{
    public static void main(String abc[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            n=n/10;
            count++;
        
        }
        System.out.println(count);
   
       
        
    }
}
