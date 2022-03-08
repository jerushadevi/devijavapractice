import java.util.Scanner;
class Hello6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
       if(age>=18)
       {
           System.out.println("eligible for Vote");
       }
       else
       {
           System.out.println("Not Eligble for Vote");
       }
    }
}
