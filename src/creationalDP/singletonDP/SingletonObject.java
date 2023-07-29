package creationalDP.singletonDP;

public class SingletonObject {
    String message = "HELLO";

    private static SingletonObject instance = new SingletonObject();

    // by making this access modifier private we are making sure that the constructor cannot be called from outside the class.

    private SingletonObject(){
        // empty constructor cannot be called from outside the class and the only method that can call it is getInstance() below.
        // we are forcing outside classes to call the getIntance() method to access the SingletonObject class.
    }
    public static SingletonObject getInstance(){
        return instance; // this method returns instance with = new SingletonObject();  -> getInstance gives use a new
        // object when we call it rather than creating object1, object2, object3 etc...
    }
    public String changeMessage(){
        return this.message = this.message + " Batch 134-135";
    }
}
