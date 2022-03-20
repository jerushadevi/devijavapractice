import java.util.*;
public class Array3
{
	public static void main(String[] args) {
	    //intialization
	    Scanner sc=new Scanner(System.in);
	    int n,sum=0;
	    System.out.println("enter size of an array");
	    n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		    sum=sum+a[i];
		}
		System.out.println(sum);
	
		
	}
}
