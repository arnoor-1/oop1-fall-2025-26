package Lab.FinalAbstractQ1;
class Rectangle extends Shape {

    double length;
    double width;
    public Rectangle(double length, double width) {
        super("Rectangle");
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width;
    }
}
