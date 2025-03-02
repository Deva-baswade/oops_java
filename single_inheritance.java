class Shape{
    public void area(){
        System.out.println("display area");
    }
}
class Trinagle extends Shape{
    public void area(int l,int h){
        System.out.println("Area of triangle is "+(0.5*l*h));
    }
}
public class single_inheritance{
    public static void main(String[] args) {
       Shape s = new Shape();
       s.area();
       Trinagle t = new Trinagle();
       t.area(12,14);
    }
}
