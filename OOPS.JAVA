class PEN {
    String color;
    String type;

    public void write() {
        System.out.println("Writing with pen");
    }

    public void print() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    public void printname(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        ///the pen object
       /* PEN pen1 = new PEN();
        pen1.color = "Blue";
        pen1.type = "Ball Point";

        PEN pen2 = new PEN();
        pen2.color = "Red";
        pen2.type = "Gel";

        pen1.print();
        pen2.print();
        pen1.printType();
        pen2.printType();*/


        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 20;

        s1.printname();


    }
}
