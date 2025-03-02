interface Animal {
    void eat();
    void sleep();//here we cant shoe function
    //Animal(){}//this is not allowed in interface
    //we not the extend we implement he property
}
interface  herbi{
    void eat();
}
class horse implements Animal,herbi{//that called multiple inheritance
    public void eat(){
        System.out.println("Horse is eating");
    }
    public void sleep(){
        System.out.println("Horse is sleeping");
    }
}

public class interfaces_java {
    Horse h = new Horse();
    h.eat();
    h.sleep();
    
}
