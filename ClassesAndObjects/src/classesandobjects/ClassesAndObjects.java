
package classesandobjects;

class Computer{
    String type;
    String OS;
    int cost;
}

public class ClassesAndObjects {

    
    public static void main(String[] args) {
       Computer comp1 = new Computer();
       comp1.OS="Windows";
       comp1.cost=300;
       comp1.type="Desktop";
       System.out.println(comp1.cost);
       System.out.println(comp1.OS);
       System.out.println(comp1.type);
       Computer comp2 = new Computer();
       comp2.OS="linux";
       System.out.println(comp2.OS);
    }
    
}

