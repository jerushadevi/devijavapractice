import java.util.*;
class NestedTryBlock{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a value:");
    int a=sc.nextInt();
    System.out.print("Enter b value:");
    int b=sc.nextInt();
    int ab[]={3,6,8,4};
    try {
        System.out.println("Value of Division:"+(a/b));
        try{
            System.out.println("New Array Element:"+(ab[4]));
        }
        catch(Exception e)
        {
            System.out.print(e);
    }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
 
