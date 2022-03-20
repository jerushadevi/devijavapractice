import java.util.*;
public class Array7
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter row value");
	    int row=sc.nextInt();
	    System.out.println("enter col value");
	    int col=sc.nextInt();
	    int a[][]=new int[row][col];
	    //reading from user
	    System.out.println("enter array elements");
	    for(int i=0;i<row;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	          a[i][j]=sc.nextInt();
	        }
	        
	    }
	    
	    //display the data
	    for(int i=0;i<row;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	            System.out.print(a[i][j]+"\t");
	        }
	        System.out.println();
	    }
	    

	    
		
	}
}
