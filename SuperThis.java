package JavaCodes;
class A{
    public A(){
        System.out.println("This is the value of A");
    }

}
class B extends A{
    public B(){
        System.out.println("This is the value of B");
    }
    public B(int x){
        System.out.println("This is the value of B in parameterized constructor");
    }
}
public class SuperThis {
    public static void main(String a[]) {
     B obj =new B(5); 
        
    }
}
