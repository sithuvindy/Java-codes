
package constructors;


public class Constructors {

    
    public static void main(String[] args) {
        
        A a1 = new A(111,"Karan");  
        A a2 = new A(222,"Aryan",25);  
        a1.display();  
        a2.display();  
        
    }
    
}

class A{
    int id;  
    String name;  
    int age;
    A(int i,String n){  
    id = i;  
    name = n;  
    }  
    A(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    } 
    void display(){
        System.out.println(id+" "+name+" "+age);
    }  
}
