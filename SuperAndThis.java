class A 
{
public A() {
	System.out.println("This is class A Constructor");
}	
}
class B extends A {
	public B() {
		System.out.println("This is class B Constructor");
	}
}
public class SuperAndThis {

	public static void main(String[] args) {
	B obj=new B();

	}

}
