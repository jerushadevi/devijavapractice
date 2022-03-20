import java.util.Scanner;
class Hello1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age,weight;
        System.out.println("enter age");
         age=sc.nextInt();
        System.out.println("Enter weight");
         weight=sc.nextInt();
       if(age>=18&&weight>=50)
       
           System.out.println("eligible for blood donation");
    
       else
       
           System.out.println("Not Eligble ");
       
    }
}


