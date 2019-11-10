package selenium;

public class R {

	int i=10;
	int j=20;
	public void m1( int i,int j)
	{
		System.out.println(this.i+this.j);
		System.out.println(i+j);
	}
public static void main(String[] args) {
	R r=new R();
	r.m1(30,40);
}
}
