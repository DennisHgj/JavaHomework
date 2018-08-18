package comp1110.homework.O04;


import static java.lang.Math.*;

public abstract class Shape {
    public abstract double perimeter();

    public abstract double area();

    double x;
    double y;
    double length;
    double radius;

    public abstract boolean overlaps(Shape other);

    public static void main(String[] args) {
        Shape s1 = new Square(1, 0, 0);    // a square with sides of 10.0 units
        Shape s2 = new Circle(1.0, 0.5, 1.5);   // a circle of radius 1.0 units
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println(s2.perimeter());
        System.out.println(s2.area());
        boolean a = s1.overlaps(s2);
        System.out.println(a);
    }
}

class Square extends Shape {

    Square(double length) {
        this.length = length;
    }

    Square(double length, double x, double y) {
        this.length = length;
        this.x = x;
        this.y = y;


    }


    @Override
    public double perimeter() {
        return length * 4;
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public boolean overlaps(Shape other) {
        double rea_x = abs(this.x - other.x);
        double rea_y = abs(this.y - other.y);
        double def_des = (this.length * 0.5) + (other.length * 0.5);
        double Sqr_diag = (sqrt(2) * 0.5 * this.length);
        double dir_x=max(rea_x-this.length*0.5,0);
        double dir_y=max(rea_y-this.length*0.5,0);
        if (other.getClass().getName().equals(Square.class.getName())) {
            if ((rea_x < def_des) && (rea_y < def_des)) {
                return true;
            } else {
                return false;
            }
        } else {
            if (this.x != other.x && this.y != other.y) {
                if ((dir_x*dir_x)+(dir_y*dir_y) < other.radius * other.radius) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if ((rea_x * rea_x) + (rea_y * rea_y) < ((0.5 * this.length + (other.radius)) * (0.5 * this.length + (other.radius)))) {
                    return true;
                } else {
                    return false;
                }

            }
        }

    }

}

class Circle extends Shape {
    //private double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;

    }

    @Override
    public double perimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public boolean overlaps(Shape other) {
        double real_x = abs(this.x - other.x);
        double real_y = abs(this.y - other.y);
        double add_radius = this.radius + other.radius;
        double dir_x=max(real_x-other.length*0.5,0);
        double dir_y=max(real_y-other.length*0.5,0);
        if (other.getClass().getName().equals(Circle.class.getName())) {
            if ((pow(real_x, 2) + pow(real_y, 2)) < pow(add_radius, 2)) {

                return true;
            } else {
                return false;
            }
        } else {

            if ((dir_x*dir_x)+(dir_y*dir_y) < this.radius*this.radius) {
                return true;
            } else {
                return false;
            }

        }

    }
}













