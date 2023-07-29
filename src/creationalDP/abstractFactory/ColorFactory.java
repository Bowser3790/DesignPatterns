package creationalDP.abstractFactory;

import creationalDP.factoryDP.Circle;
import creationalDP.factoryDP.Rectangle;
import creationalDP.factoryDP.Square;

public class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
