package selenium;

public class Test {

	void m1()
	{
		
		System.out.println(" m1 methods");
	}
	void  m2(int i)
	{
		this.m1();
		System.out.println(i);
		System.out.println(" hello");
		}
	void m3(int i,int j)
{
		this.m2(10);
System.out.println(i+j);

}
	void m4 ()
	{
	this.m3(20, 30);
	System.out.println("m4  method");
	}	
	public static void main(String[] args) {
		Test t=new Test();
			t.m4();
				
	}
	
}
