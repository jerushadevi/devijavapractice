import java.util.*;
public class Max
{
	public static void main(String[] args) {
	    //intialization
	    Scanner sc=new Scanner(System.in);
	    int n,max;
	    System.out.println("enter size of an array");
	    n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    
		}
		max=a[0];
	
		for(int i=0;i<n;i++)
		{
		    if(max<a[i])
		    {
		        max=a[i];
		    }
		}
		System.out.println("max value is "+max);
	
		
	}
}
