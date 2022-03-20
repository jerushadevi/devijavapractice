abstract class Animal
{
    abstract void eat();
    void print()
    {
        System.out.println("printing-------");
    }
}
class dog extends Animal
{
    void eat()
    {
        System.out.println("The dog is eating fruit");
    }
}
class cat extends Animal

{
    void eat()
    {
        System.out.println("the cat is drinking milk");
    }
}
class Absttract_Animal1
{
    public static void main(String args[])
    {
        dog d=new dog();
        cat c=new cat();
        c.eat();
        d.eat();
    }
}
