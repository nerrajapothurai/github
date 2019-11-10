package selenium;

public class N {


public void m1()
{
System.out.println(" m1 method");
}
 static void m2()
 {
	 
	 System.out.println(" m2 method");
 }
}
 class P extends N
 {
	 public void m3(int i,int j)
	 {
		 
	
		 this.m1();
		 System.out.println(i+j);
	 }
	 public void m4()
	 {
		
		 this.m3(10, 20);
		 System.out.println( " m4 method");
	 }
public static void main(String[] args) {
	P n=new P();
	n.m4();
	m2();
}
	}
 