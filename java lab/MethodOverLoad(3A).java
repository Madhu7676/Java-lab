class MethodOverLoad
{
void calValue()
{
int x=20;
x=x*x;
System.out.println("sqrt of x is :"+x);
}
void calValue(int y)
{
y=y*y*y;
System.out.println("Cube of y is:"+y);
}
void calValue(int m,int n)
{
int z=m*n;
System.out.println("product of m and n is:"+z);
} }
class MOL
{
public static void main(String args[])
{
MethodOverLoad m= new MethodOverLoad();
m.calValue();
m.calValue(10,20);
m.calValue(10);
}
}