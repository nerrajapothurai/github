package selenium;

public class It {
	int i;
	int j;
public void m1()
{
	System.out.println( "m1 method");
}
}
class  It2 extends It
{
	public void m2(int i,int j)
{
		this.m1();
		System.out.println( i+j);
		System.out.println( "m2 method");
		}
	public void m3(int k)
	{
		
		super.m1();
		this.m2(10, 20);
		System.out.println( " m3 method");
		System.out.println("k");
	}

	public static void main(String[] args) {
It2 i=new It2();
  i.m3(40);
 System.out.println( "m3 value");

	}
}

