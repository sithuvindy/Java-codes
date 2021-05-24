
package inheritance;


public class Inheritance {
   
    public static void main(String[] args) {
        Class obj = new Class();
        System.out.println(obj.Name);
        System.out.println(obj.id);
        System.out.println(obj.Subject);
        System.out.println(obj.NumOfStudents);
        obj.disp();
    }
    
}
class Teacher {
    int id = 123;
    String Name = "Sithumi";
    String Subject = "Maths";
    void disp(){
	System.out.println("Parent Method");
    }
    Teacher(){
        System.out.println("Constructor of Parent");
    }
}
class Class extends Teacher{
    int NumOfStudents =40;
    @Override
    void disp(){
	System.out.println("Child Method");
        super.disp();
    }
    Class(){
        System.out.println("Constructor of Child");
    }
}