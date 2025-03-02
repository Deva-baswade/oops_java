public class poly {

    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    // poly means many methods with the same method name but different parameters
    // method overloading

    public static void main(String[] args) {
        
        // polymorphism
        // method overloading
        
        poly s1 = new poly();
        s1.name = "deva";
        s1.age = 20;
        
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
