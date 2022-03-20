import java.util.*;
public class Ascll
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		int v=ch;// widening type conversion
		char c= (char)v;//narrowing
		System.out.println(v);
		System.out.println(c);
		
		
	}
}
