class Shape {
    public void area() {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
    // Use method overloading to provide area method for Triangle
    public void area(int l, int h) {
        System.out.println("Area of triangle is " + (0.5 * l * h));
    }
}

class Equilateral extends Triangle {
    // Use method overloading to provide area method for Equilateral triangle
    @Override
    public void area(int b, int w) {
        System.out.println("Area of equilateral triangle is " + (0.5 * b * w));
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(); // display area

        Triangle t = new Triangle();
        t.area(12, 14); // Area of triangle is 84.0

        Equilateral e = new Equilateral();
        e.area(12, 14); // Area of equilateral triangle is 84.0
    }
}

