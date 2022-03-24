import java.util.*;
public class ExeceptionHanding
{
public static void main(String[] args) {
String s="Devi";
System.out.println(s.length());
try {
System.out.println(s.charAt(8));
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println(e);
}
System.out.println("Hello World");
}
}

