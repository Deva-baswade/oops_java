abstract class Animal{//this class we also not show to user
    abstract  void walk();//here we not show to user
}
class Horse extends Animal{
    void walk(){
        System.out.println("Horse is walking");
    }
}
class Dog extends Animal{
    void walk(){
        System.out.println("Dog is walking");
    }
}

public class Abs {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        Dog d = new Dog();
        d.walk();
    }
    
}
//this not he pure abstraction