public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}


// Here, open-closed principle is implemented. If we want to add a new shape, we just need to add a new class and implement the Shape interface.
// We don't need to change the ShapeFactory class. This is the advantage of Factory Pattern. It is also called as Factory Method Pattern.
// Instead, we just add another if else block in the getShape method of the ShapeFactory class to add a new shape.