package ZhiFeng;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        Shape shape2 = new ETriangle();
        Shape shape3 = new Circle();
        Shape shape4 = RPentagon();
        System.out.println(shape4);
        System.out.println("My primeter is: "+shape4.getPrimeter());
        System.out.println("My Area is: "+ shape4.getArea());
    }
}
