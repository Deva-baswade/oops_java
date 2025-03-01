class Student {
    String name;
    int age;

    public void printname() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Commented out default constructor
    /*
    Student() {
        // The class and the constructor name are the same
        // Constructor is used only once when the object is created
        // Constructor is written without any return type
        // Constructor is used to initialize the object
        System.out.println("This is a constructor with no parameters");
    }
    */

    // Parameterized constructor
    /*Student(String name, int age) {
        this.name = name; // After the assignment is the parameter, and before is the instance variable
        this.age = age;
        System.out.println("This is a constructor with parameters");
    }*/

    //copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){
        
    }
}

public class Constructor {
    public static void main(String[] args) {
        //Student s1 = new Student("Devanand", 20); // Here, Student() is the parameterized constructor
        Student s1 = new Student();
        s1.name = "Devanand";
        s1.age = 20;

        Student s2 = new Student(s1); // Copy constructor
        s1.printname();
    }
}
