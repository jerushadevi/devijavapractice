class Animal
{
    String color="black";
    String bread;
    Animal(String color)
    {
        this.color=color;
       
    }
}
class Dog extends Animal
{    String color;
    Dog()
    {
        super("red");
    }
    
    void display()
    {
        System.out.println("paren class method");
    }
    void bark()
    {
        System.out.println("barking..........");
    }
}

class Main22
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        System.out.println(d.color);
        
        
    }
}
