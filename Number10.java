import java.util.*;
class Number10
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter char");
        ch=sc.next().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.println("LowerCase Alphabet");
        }
        else if(ch>='A'&&ch<='Z')
        {
            System.out.println("Uppercase Alphabet");
        }
        else if(ch>='0'&&ch<='9')
        {
            System.out.println("Digit");
        }
        else{
            System.out.println("Special character");
        }
        
    }
}
