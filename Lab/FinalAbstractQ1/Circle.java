package Lab.FinalAbstractQ1;

class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        super("Circle");
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}