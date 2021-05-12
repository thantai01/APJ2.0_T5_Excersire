package Shapes;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {return this.width;}
    public double getHeight() {return this.height;}
    public String getColor() {return super.getColor();}
    public boolean isFilled() {return super.isFilled();}

    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setColor(String color) {super.setColor(color);}
    public void setFilled(boolean filled) {super.setFilled(filled);}

    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{width = " + this.width + " ,height =" + this.height
                + " ,which is a subclass of "+ super.toString() + "}";
    }
}
