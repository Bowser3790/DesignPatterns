package structuralDP.proxyDP;

/*
In this example:

The ImageGenerator interface defines the common methods for both the real image and the proxy image.

The RealImage class represents the real image object that implements the ImageGenerator interface. It handles the
actual loading and displaying of the image.

The ImageProxyClass acts as a proxy for the real image. It implements the ImageGenerator interface and delays the
creation of the real image object until it is necessary. When the displayImage() method is called, it checks if the
real image object is null. If it is, it creates an instance of RealImage with the provided image path. It then
delegates the display operation to the real image object.

The Main class demonstrates the usage of the proxy pattern by creating an instance of ImageProxyClass and calling
the displayImage() method.

 */

public class ProxyRunner {
    public static void main(String[] args) {
        ImageGenerator proxyImage1 = new ImageProxyClass("C//image1.png");
        ImageGenerator proxyImage2 = new ImageProxyClass("C//image2.png");
        proxyImage2.showImage();
        proxyImage1.showImage();
    }
}
