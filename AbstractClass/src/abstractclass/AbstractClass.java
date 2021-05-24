
package abstractclass;


public class AbstractClass {
   
    public static void main(String[] args) {
        A obj = new B();
        obj.mymethod();
    }
    
}
abstract class A{
    
    abstract void mymethod();
    
}

class B extends A{

    @Override
    void mymethod() {
        System.out.println("My method of the subclass B");
    }
    
}