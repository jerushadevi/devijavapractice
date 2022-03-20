  import java.util.Scanner;      
  class FirstDemo
  {
    public static void main(String args[])
    {
        int n,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        n=sc.nextlnt();
        
        for(f=1;n>=1;n--)
        {
            f=f+n;
        }
        System.out.println("the Factorial value is:"+f);
    
  }
        
    }
