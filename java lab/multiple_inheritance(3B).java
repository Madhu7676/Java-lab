interface printable
{
void print();
}
interface showable
{
void show();
}
class multiple_inheritance implements printable, showable
{
public void print()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("Welcome");
}
public static void main(String args[])
{
multiple_inheritance obj = new multiple_inheritance ();
obj.print();
obj.show();
}
}