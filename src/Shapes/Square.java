package Shapes;

public class Square extends Rectangle {

    public Square(float side) {super(side,side);}

    public Square() {
        setWidth(1);
        setHeight(1);
    }
    public double getSide(){ return getHeight(); }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }
    public void setWidth(double width) { setSide(width); }
    public void setHeight(double height) { setSide(height); }

    @Override
    public String toString() {
        return "A Square with side= " + getSide() +
                ", which is a subclass of" + super.toString();
    }
}
