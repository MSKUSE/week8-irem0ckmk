import java.util.Objects;

public class Rectangle extends Shape{
    private int sideA,sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }
/*
    @Override
    public void describe() {
        super.describe();
        //System.out.println("this");
        System.out.println("Side a is "+ this.sideA + " Side b is "+ this.sideB);

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

 */

    @Override
    public boolean equals(Objects obj) {
        Rectangle r = (Rectangle) obj;
        if(this.sideA == r.sideA && this.sideB == r.sideB && this.getColor() == r.getColor()){
            return true;
        }
        else{
            return false;
        }
        //return super.equals(obj);
    }



}
