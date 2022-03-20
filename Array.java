import java.util.*;
public class Array
{
	public static void main(String[] args) {
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		//read the elements from user to array
		System.out.println("enter array elements");
		for(int i=0;i<5;i++)//1<5
		{
		    a[i]=sc.nextInt();
		}
	
		
		//print array elements
		
		System.out.println("array elements are");
		for(int i=0;i<5;i++)//i=5
		{
		System.out.println(a[i]);
		}
		
	}
}
