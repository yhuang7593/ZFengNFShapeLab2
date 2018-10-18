package ZhiFeng;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Rectangle(4,5);
        Shape shape2 = new ETriangle(2);
        Shape shape3 = new Circle(4);
        Shape shape4 = new RPentagon(5);
        //System.out.println(shape4);
        //System.out.println("My primeter is: "+shape4.getPerimeter());
        //System.out.println("My Area is: "+ shape4.getArea());
        Shape[] shapes = {shape1,shape2,shape3,shape4};
        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: "+cur.getArea());
            System.out.println("My preimeter is: "+cur.getPerimeter());
        }
    }
}
