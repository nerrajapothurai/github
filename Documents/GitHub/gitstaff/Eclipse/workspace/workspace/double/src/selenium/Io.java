package selenium;

public interface Io {
void m1();
void m2();
}
interface  Io2
{
	void m3();
	 
}
abstract class E implements Io2
{
	
}
abstract class G extends E implements Io
{
	 public void m1()
	{
	 System.out.println(" m1 method");	
	}
}
	 class C extends G
	 {
		public void m2()
		{
			System.out.println(" m2 method ");
		}
		public void m3()
		{
			System.out.println(" m3 method");
		}
		public static void main(String[] args) {
			
			C io=new C();
			io.m1();
			io.m2();
			io.m3();
		}
	 }
