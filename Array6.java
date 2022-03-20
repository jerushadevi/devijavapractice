import java.util.*;
public class Array6
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a[][]=new int[3][4];
	    //reading from user
	    System.out.println("enter array elements");
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<4;j++)
	        {
	          a[i][j]=sc.nextInt();
	        }
	        
	    }
	    
	    //display the data
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<4;j++)
	        {
	            System.out.print(a[i][j]+"\t");
	        }
	        System.out.println();
	    }
	    

	    
		
	}
}
