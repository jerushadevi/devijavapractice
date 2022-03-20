class Animal
{
    String color="black";
    String bread;
}
class Dog extends Animal
{
    String color="red";
    void display()
    {
        System.out.println("paren class method");
    }
    void bark()
    {
        System.out.println("barking..........");
    }
}
class cat extends Dog{
    String color="white";
    //overriding
    void display()
    {
        System.out.println("child class metrhod");
        super.display();
    }
    
}
class Overriding
{
    public static void main(String args[])
    {
        cat d=new cat();
        //d.color="red";
        d.bread="jarman";
        d.display();
        System.out.println(d.color);
    }
}
