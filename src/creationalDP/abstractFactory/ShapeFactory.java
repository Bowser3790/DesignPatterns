package creationalDP.abstractFactory;


public class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        return null;
        // why did we include this here? because if the request is returning color then this class will return null
        // because this class only deals with shapes.
    }

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        }
        return null;

    }

}
