
package polymorphism;


public class Polymorphism {

    
    public static void main(String[] args) {
       Animal obj = new Rabbit();
       obj.eat();
    }
    
}
class Animal{
    void eat(){
        System.out.println("Eating..");
    }
}
class Rabbit extends Animal {
    @Override
    void eat(){
        System.out.println("Eating Carrot..");
    }
}
class Cow extends Animal {
    @Override
    void eat(){
        System.out.println("Eating Grass");
    }
}