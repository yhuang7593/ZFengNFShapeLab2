package ZhiFeng;

public class ETriangle extends Shape {
    private int side;

    public ETriangle(int side){
        super("ETriangle");
        this.side=side;
    }
    @Override
    public double getArea(){
        return .5*((side*Math.sqrt(3))*side);
    }

    @Override
    public double getPerimeter(){
        return side*3;
    }
}
