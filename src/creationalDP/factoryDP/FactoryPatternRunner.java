package creationalDP.factoryDP;

public class FactoryPatternRunner {
    public static void main(String[] args) {
//        Circle circle1 = new Circle();
//        circle1.draw();
//
//        Square square1 = new Square();
//        square1.draw();
//
//        Rectangle rect1 = new Rectangle();
//        rect1.draw();

        // the problem with this is that we are creating each shape individually and this can take a long time.

        // if we have thousands of shapes in our database then we might have to go and look at all the shapes to figure out which one we need
        // then create an object and this takes a lot of time.

        // there is a flaw with this object creation above. it is not efficient

        // let's create a factory of shapes and then the factory object will have all objects needed and we will
        // call the factory to draw the shape. according to our request
        // see our shape factory class.

// rather than creating 3 new objects like we did above...
// we are going to create 1 new shapeFactory. (below)

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Square");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Circle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape3.draw();


    }
}
