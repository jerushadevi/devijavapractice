import java.util.Scanner;
class Hello4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the num1");
        num1=sc.nextInt();
         System.out.println("Enter the num2");
        num2=sc.nextInt();
        if(num1>num2)//12>34//false
        {
            System.out.println("num1 is big");
        }
        if(num2>num1)//34>12//True
        {
            System.out.println("num2 is big");
        }
    }
}
