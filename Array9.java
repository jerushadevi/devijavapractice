import java.util.*;
public class Array9
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter row value");
	    int n=sc.nextInt();
	    
	    int a[][]=new int[n][n];
	    //reading from user
	    System.out.println("enter array elements");
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	          a[i][j]=sc.nextInt();
	        }
	        
	    }
	    
	    //check the condition    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(a[i][j]!=20&&a[i][j]>=10)
	            {
	                System.out.println("No");
	                return;
	            }
	        }
	       
	    }
	    System.out.println("yes");

	    
		
	}
}

