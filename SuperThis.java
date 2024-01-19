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
}
public class SuperThis {
    public static void main(String a[]) {
     B obj =new B(); 
        
    }
}
