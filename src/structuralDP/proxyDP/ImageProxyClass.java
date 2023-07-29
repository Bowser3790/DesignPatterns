package structuralDP.proxyDP;

public class ImageProxyClass implements ImageGenerator{


    private RealImageClass realImageClass;
    private String fullPath;

    public ImageProxyClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
        if(realImageClass == null){
            realImageClass= new RealImageClass(fullPath);
            realImageClass.showImage();

        }

    }
}
