
package interfaces;


public class Interfaces {
    
    public static void main(String[] args) {
        B obj = new B();
        obj.eat();
    }
    
}

interface A{
    void eat();
}

class B implements A{
    @Override
    public void eat(){
        System.out.println("Eating Fruits");
    }
}