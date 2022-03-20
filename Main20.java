class Animal
{
    String color;
    String bread;
    String name;
    String gender;
}
class dog extends Animal
{
    int legs;
    void bark()
    {
        System.out.println("barking");
    }
}
class cat extends dog
{
    String eyecolor;
    void drink()
    {
        System.out.println("drinking milk");
    }
}
class Main20
{
    public static void main(String args[])
    {
        cat meow=new cat();
        meow.color="black";
        meow.eyecolor="blue";
        meow.legs=3;
        System.out.println(meow.color);
        System.out.println(meow.eyecolor);
        System.out.println(meow.legs);
        meow.bark();
        meow.drink();
        
       
    }
    
}