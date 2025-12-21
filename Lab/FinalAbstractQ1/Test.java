package Lab.FinalAbstractQ1;
public class Test {
     public static void main(String[] args) {

        Shape s1 = new Circle(3.5);
        Shape s2 = new Rectangle(4, 6);

        s1.displayShape();
        System.out.println("Area: " + s1.calculateArea());

        s2.displayShape();
        System.out.println("Area: " + s2.calculateArea());
    }
}