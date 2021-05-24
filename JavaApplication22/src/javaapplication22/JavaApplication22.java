
package javaapplication22;


public class JavaApplication22 {

   
    public static void main(String[] args) {
        
        int v1=1 , v2=3;
        String name1="Sithu" , name2="Vindy";
        
        Method My1 = new Method();
        My1.cal(v2, v2);
        My1.cal(name1, name2);
     
    }
     
}

class Method{
    public void cal (int a,int b){
        System.out.println("Addition " + (a+b));
    }
    public void cal (String x,String y){
        System.out.println("concatanation " + (x+" "+y));
    }
}
