ECEB.java
______
package cmr;
public class ECEB
{
public void add(int a,int b)
{
System.out.println(a+b);
}
}


ECEB1.java
___
package cmr;
public class ECEB1
{
public void sub(int a,int b)
{
System.out.println(a-b);
}
}

mypack.java
____
import cmr.ECEB;
import cmr.ECEB1;
class Mypack
{
public static void main(String args[])
{
ECEB m=new ECEB();
ECEB1  n=new ECEB1();
m.add(12,5);
n.sub(20,10);
}
}

rsult:javac -d.ECEB.java
javac -d.ECEB1.java
javac mypack.java
java mypack