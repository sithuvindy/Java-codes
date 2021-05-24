
package encapsulation;


public class Encapsulation {

    
    public static void main(String[] args) {
        
        Student s = new Student();
        s.setName("Sithu");  
        //System.out.println(s.getName()); 
        s.getName();
    }
    
}

class Student {
    private String name;

    
    public void getName() {
        //return name;(if you are using return name give the return tyoe for the getName method as String)
        System.out.println(name);
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
}