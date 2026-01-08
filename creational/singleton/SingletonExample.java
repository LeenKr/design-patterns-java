public class SingletonExample {

    // Single instance of the class
    private static SingletonExample instance;

    // Private constructor
    private SingletonExample() {
        System.out.println("Singleton instance created");
    }

    // Public method to provide access to the instance
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
