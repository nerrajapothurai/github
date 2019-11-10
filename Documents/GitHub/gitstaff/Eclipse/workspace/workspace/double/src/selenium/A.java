package selenium;

public class A {
public void m1()
{
	System.out.println("A");
	}
}
class B extends A
{
public void m2()
	{
	
	System.out.println("B");
	}
public void m3(int i)
{
	super.m1();
	this.m2();
	System.out.println("m3 method");

}

public static void main(String[] args) 
{
	B a=new B();
	a.m3(10);
}
}

	
    














	
	

	










