package selenium;

public class C {
public static int m1()
{
	int i=10;
	System.out.println(i);
	return i;
}
	public int m2()
	{
		int k=m1();
		System.out.println(k);
		int j=20;
		System.out.println(j);
		return j;
	}
public static void main(String[] args) {
	C a=new C();
int z=a.m2();
	System.out.println(z);
}
}