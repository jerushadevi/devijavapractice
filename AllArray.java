import java.util.*;
public class AllArray
{
	public static void main(String[] args) {
	    //intialization
	    Scanner sc=new Scanner(System.in);
	    int n,max;
	    System.out.println("enter size of an array");
	    n=sc.nextInt();
		int a[]=new int[n];
		//Reading elements from user
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    
		}
		
		//copy array elemenst to another array
		int a1[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
		    a1[i]=a[i];
		}
		//Original array
		System.out.println("************Original Array*********");
		for(int i=0;i<a.length;i++)
		{
		    System.out.println("a["+i+"]= "+a[i]);
		}
			//Copied  array
		System.out.println("************Copied Array*********");
		for(int i=0;i<a1.length;i++)
		{
		    System.out.println("a1["+i+"]= "+a1[i]);
		}
	
		
	}
}
