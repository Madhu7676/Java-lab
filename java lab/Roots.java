import java.util.Scanner;
class Roots
{
public static void main(String args[])
{
int a,b,c;
double x,y;
Scanner s=new Scanner(System.in);
System.out.println("enter the values of a,b, and c");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
double f=(b*b)-4*a*c;
System.out.println("F value="+f);
if(f<0)
{
System.out.println("No real roots");
}
else
{
double l=Math.sqrt(f);
x=((-b-l)/(2*a));
y=((-b+l)/(2*a));
System.out.println("Roots of given equation:"+x+"\t"+y);
}
}
}