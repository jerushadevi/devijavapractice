import java.util.*;
public class Array4
{
	public static void main(String[] args) {
	    //intialization
	    Scanner sc=new Scanner(System.in);
	    int n,max;
	    System.out.println("enter size of an array");
	    n=sc.nextInt();
		int a[]=new int[n];
		//Reading elements from user
		System.out.println("Enter array elelments");
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    
		}
		
		//sorting
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]>a[j])
		        {
		            int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		}
		
		//Print sorted array
		System.out.println("Sorted array");
		for(int i=0;i<n;i++)
		{
		    System.out.println(a[i]);
		}
		
	
		
	}
}
