import java.util.*;
class Student
{
    int rollno;
    String name;
    String section;
    int marks;
    String address;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter roolno");
        rollno=sc.nextInt();
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter section");
        section=sc.next();
        System.out.println("enter marks");
        marks=sc.nextInt();
        System.out.println("enter address");
        address=sc.next();
        
    }
    void display()
    {
        System.out.println(rollno+"\n"+name+"\n"+section+"\n"+marks+"\n"+address);
    }
    
    void reading()
    {
        System.out.println(name+" reading");
    }
    void writing()
    {
        System.out.println(name+" Writing");
    }
    
    
}
class Main5
{
    public static void main(String args[])
    {
        Student std1=new Student();
     
       std1.input();
        System.out.println("Student 1 informatio");
        std1.display();
        std1.reading();
        std1.writing();
        Student std2=new Student();
        std2.input();
        System.out.println("Student 2 informatio");
      std2.display();
        std2.reading();
        std2.writing();
        

        
    }
}



