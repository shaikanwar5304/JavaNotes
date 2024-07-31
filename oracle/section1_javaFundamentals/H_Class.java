class myClass {
    private int instanceVariable;//always it should be private should be accessed by getter and setter methods
    public myClass(){
        System.out.println("myClass constructor");
    }
    int getInsVar(){
        return instanceVariable;
    }
    void setInsVar(int val){
        this.instanceVariable=val;
    }
}

public class H_Class{
    public static void main(String[] args) {
        myClass myObj=new myClass();//myClass constructor
        //myObj.instanceVariable Error
        
    }
}