package structuralDP.decoratorDP;

/*
In this example:

The Iphone interface defines the common methods for all iPhone objects.
The IphoneBase class is the base class that implements the Iphone interface and provides the basic iPhone features.
*The IphoneDecorator class is the decorator class that implements the Iphone interface and holds a reference to an
Iphone object.* -> this is the part that is in the parameters (this can be confusing)...
The Iphone11ProMax class extends IphoneDecorator and adds additional features specific to the iPhone 11 Pro Max.
The Main class demonstrates the usage of the decorator pattern by creating an instance of Iphone11ProMax with an
underlying IphoneBase object.
 */

public class DecoratorRunner {
    public static void main(String[] args) {

        Phone iphone11ProMax = new Iphone11ProMax(new Iphone());
        System.out.println("name: " + iphone11ProMax.getName());
        System.out.println("Number of Camera: " + iphone11ProMax.cameraCount());
        System.out.println("Price: $" + iphone11ProMax.getPrice());


    }
}
