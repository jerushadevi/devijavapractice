import java.util.*;
class Number
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        switch(ch)//Switch variable
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'i':
            case 'o':
            case 'e':
            case 'u':
                System.out.println("vowel");
                break;
            default:
            System.out.println("Consonant");
                
                
        }
    }
}
