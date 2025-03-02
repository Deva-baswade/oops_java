class Shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("Area of triangle is "+(0.5*l*h));
    }
}
class circle extends Shape{
    public void area(int r){
        System.out.println("Area of circle is "+(3.14*r*r));
    }
}
//this called hierarchical inheritance
//here one parent and other from that parent class


public class inheritance3 {
    public static void main(String[] args) {
       Shape s=new Shape();
       s.area();
       Triangle t=new Triangle();
       t.area(12,10);
       circle c = new circle();;
       c.area(5);     
        
    }
    
}
