package selenium;

public class D {
D()
{
	this(10);
	System.out.println("hello");
}

D( int i)
{
	this(10.0f);
	System.out.println("int _arg _con");
	System.out.println("0_arg_con");
}
D(float j)
{
	System.out.println("float _arg _con");
	System.out.println("1_arg_con");
}

public static void main(String[] args) {
	D d=new D();
}
}
