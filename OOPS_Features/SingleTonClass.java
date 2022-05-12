public class SingleTonClass {
    // static class reference
    private static SingleTonClass obj = null;

    private SingleTonClass() {
        // private constructor will prevent the instantiation (object creation) of this
        // class directly
    }

    public static SingleTonClass objectCreationMethod() {
        // This logic will ensure that no more than one object can be created at a time
        if (obj == null) {
            obj = new SingleTonClass();
        }
        return obj;
    }

    public void display() {
        System.out.println("Single tone class example for private constructor");
    }

    public static void main(String args[]) {
        // objects cannot be created directly due to private constructor
        SingleTonClass object1 = SingleTonClass.objectCreationMethod();
        object1.display();
    }
}
