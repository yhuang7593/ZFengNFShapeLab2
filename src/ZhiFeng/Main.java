package ZhiFeng;

public class Main {

    public static void main(String[] args) {
        //Shape shape1 = new Rectangle();
        //Shape shape2 = new ETriangle();
        //Shape shape3 = new Circle();
        Shape shape4 = new RPentagon(5);
        System.out.println(shape4);
        System.out.println("My primeter is: "+shape4.getPerimeter());
        System.out.println("My Area is: "+ shape4.getArea());
        Shape[] shapes = {shape4};
        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: "+cur.getArea());
            System.out.println("My preimeter is: "+cur.getPerimeter());
        }
    }
}
