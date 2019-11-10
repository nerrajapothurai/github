package selenium;

public interface Ne {
 void m1();
 void m2();
}
interface Nee
{
	void m3();	
}
abstract class C1 implements Nee
{
	
}
abstract class E1 extends C1 implements Nee
{
	public void m1()
	{
		System.out.println("helloo");
	}
}
	 class W extends E1 
	{
		public void m2()
		{
		System.out.println("how are you");	
		}
		public void m3(int i,int j)
		{
			System.out.println(i+j);
			System.out.println(" were are you"); 
		
		System.out.println("m3 method");
		}
			
public static void main(String[] args) {
	W io=new W();
	io.m1();
	io.m2();
	io.m3(10,20);
}
}
	
