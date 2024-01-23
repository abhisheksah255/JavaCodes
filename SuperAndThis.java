class A 
{
public A() {
	super();
	System.out.println("This is class A Constructor");
}	
public A(int y) {
	super();
	System.out.println("This is the Patametrized A contructor");
}
}
class B extends A {
	public B() {
		super();
		System.out.println("This is class B Constructor");
	}
	public B(int x) {
		super(x);
		System.out.println("This is the Patametrized B contructor");
	}
}
public class SuperAndThis {

	public static void main(String[] args) {
	B obj=new B(5);

	}

}
