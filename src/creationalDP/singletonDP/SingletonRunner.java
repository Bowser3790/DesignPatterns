package creationalDP.singletonDP;

public class SingletonRunner {
    public static void main(String[] args) {
        SingletonObject object1 = SingletonObject.getInstance();
        System.out.println(object1.message);
        System.out.println(object1.changeMessage());

        SingletonObject object4 = SingletonObject.getInstance();
        System.out.println("message by object4: " + object4.message);

    }

}
