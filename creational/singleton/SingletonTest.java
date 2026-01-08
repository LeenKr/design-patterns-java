public class SingletonTest {

    public static void main(String[] args) {

        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();

        s1.showMessage();

        // This will print true because both references point to the same instance
        System.out.println(s1 == s2);
    }
}
