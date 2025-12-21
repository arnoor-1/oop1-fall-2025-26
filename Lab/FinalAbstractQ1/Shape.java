package Lab.FinalAbstractQ1;

abstract class Shape {
    String shapeName;
    abstract double calculateArea();
    public void displayShape() {
        System.out.println("This is a " + shapeName);
    }
    public Shape(String shapeName) {
        System.out.println("Shape constructor called");
        this.shapeName = shapeName;
    }
}