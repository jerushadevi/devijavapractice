class Employee
{
    int empid;
    String name;
    int salary;
    String DOB;
    
    double HRA()
    {
        double hra=(salary*20)/100;
        return hra;
        
    }
}
class Manager extends Employee
{
    double DA()
    {
        double da=(salary*10)/100;
        return da;
    }
}

class Main16
{
    public static void main(String args[])
    {
        Manager Devi=new Manager();
        Devi.salary=20000;
        System.out.println(Devi.salary);
       double hr=Devi.HRA();
            System.out.println(hr);
       
      double d=Devi.DA();
      
            System.out.println(d);
       
       double grosssalary=Devi.salary+d+hr;
        System.out.println(grosssalary);
    }
}

