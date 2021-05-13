package CircleCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius(){ return this.radius; }
    public void setRadius(double radius) {this.radius = radius;}

    public String getColor(){ return this.color;}
    public void setColor(String color) {this.color = color;}

    public double getArea(double radius){ return this.radius*this.radius*Math.PI; }
    public double getPerimeter(double radius) { return this.radius* Math.PI *2; }


}

