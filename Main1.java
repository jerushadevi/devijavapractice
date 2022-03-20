import java.util.Scanner;
class Employee
{
    int Empid;
    String Ename;
    String Edept;
    long Esalary;
    String Eadress;
    
void  totalsalary(){
    
    float grosssalary,totalsalary,da,hra;
    
    /*Scanner emp=new Scanner(System.in);
System.out.println("Enter employee name");

    String  Ename=emp.nextString();
    System.out.println("Enter Employee Salary:");
       float salary=emp.nextFloat();
       */
       if(Esalary>10000&&Esalary<=20000)
       {
           hra=(Esalary*25)/100;
           da=(Esalary*45)/100;
           grosssalary=hra+da;
           totalsalary=Esalary+grosssalary;
           System.out.println("The Gross salary of the employee is:" +grosssalary);
           System.out.println("The Total salary of the employee is:" +totalsalary);
       }
     else if(Esalary>20000&&Esalary<=40000){
         
            hra=(Esalary*25)/100;
           da=(Esalary*20)/100;
           grosssalary=hra+da;
           totalsalary=Esalary+grosssalary;
           System.out.println("The Gross salary of the employee is:" +grosssalary);
           System.out.println("The Total salary of the employee is:" +totalsalary);
           
       }
       else{
           hra=(Esalary*30)/100;
           da=(Esalary*30)/100;
           grosssalary=hra+da;
           totalsalary=Esalary+grosssalary;
           System.out.println("The Gross salary of the employee is:" +grosssalary);
           System.out.println("The Total salary of the employee is:" +totalsalary);
       }
       
}
}
class Main1
{
    public static void main(String[] args){
        
        Employee emp1=new  Employee();
        
        emp1.Empid=101;
        emp1.Ename="Prathap";
        emp1.Edept="Administration";
        emp1.Esalary=12500;
        emp1.Eadress="vijayawada";
        System.out.println("Employee"+" "+emp1.Ename+"Information:");
        System.out.println("ID:"+emp1.Empid+"\n"+" Name:"+emp1.Ename+"\n"+"Department:"+emp1.Edept+"\n"+"Salary:"+emp1.Esalary+"\n"+"Adress:"+emp1.Eadress);
        emp1.totalsalary();
        

 Employee emp2=new  Employee();
        
        emp2.Empid=105;
        emp2.Ename="devi";
        emp2.Edept="Manager";
        emp2.Esalary=60000;
        emp2.Eadress="machilipatam";
        System.out.println("Employee"+" "+emp2.Ename+"Information:");
         System.out.println("ID:"+emp2.Empid+"\n"+"Name:"+emp2.Ename+"\n"+"Department:"+emp2.Edept+"\n"+"Salary:"+emp2.Esalary+"\n"+"Adress:"+emp2.Eadress);
    
        emp2.totalsalary();
        
    }
}