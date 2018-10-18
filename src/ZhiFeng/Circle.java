package ZhiFeng;
import java.lang.Math;

public class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        super("Circle");
        this.radius= radius;
    }
    @Override
    public double getArea(){
        return (Math.pow(radius,2))*Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
