import java.util.Scanner; 
class Prime
{
public static void main(String[] args)
{
int n,p;
Scanner s=new Scanner(System.in);
System.out.println("Enter upto which number prime number are needed");
n=s.nextInt();
System.out.println("<-----------Prime numbers----------->");
for(int i=2;i<n;i++)
{
p=0;
for(int j=2;j<i/2;j++)
{
if(i%j==0)
p=1;
}
if(p==0)
System.out.println(i);
}
}
}