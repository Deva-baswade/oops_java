class  Student{
    String name;
    static String college;
}
public class statis_ {
    public static void main(String[] args) {
      Student.college="IIT";
        Student s1 = new Student();
        s1.name="Rahul";
        System.out.println(s1.name+" "+Student.college);
    }
}