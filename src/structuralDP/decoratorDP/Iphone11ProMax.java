package structuralDP.decoratorDP;

public class Iphone11ProMax extends Iphone11Pro{

    public Iphone11ProMax(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"MAX";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1;
    }

    @Override
    public double getPrice() {
        return super.getPrice()+200;
    }
}
