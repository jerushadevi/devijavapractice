import java.util.scanner;
class BloodDonation
{
    public static void main(String args[])
    {
        scanner sc=new scanner(System.ln);
        System.out.println("enter age");
        int age=sc.nextint();
        System.out.println("enter weight");
        int weight=sc.nextlnt();
        if(age>=18 && weight>=50)
        {
            System.out.println("eligible for donation")
            
        }
        else
        {
            System.out.println("not eligible");
            
        }
    }
}