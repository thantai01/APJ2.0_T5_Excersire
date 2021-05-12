package Shapes;

class Circle extends Shape {
    private double radius;
    private final double pi = Math.PI;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public String getColor(){
        return super.getColor();
    }
    public boolean isFilled() {
        return super.isFilled();
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){ this.radius = radius; }
    public void setColor(String color){ super.setColor(color); }
    public void setFilled(boolean filled) { super.setFilled(filled);}

    public double getArea(){
        return this.pi*(this.radius*this.radius);
    }
    public double getPerimeter(){
        return this.radius*2*this.pi;
    }

    @Override
    public String toString() {
        return "Circle{with radius= " + this.radius +
                ", which is a subclass off +" +
                super.toString() + "}";
    }
}
