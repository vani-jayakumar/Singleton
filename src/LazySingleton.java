public class LazySingleton {

    private static LazySingleton obj;

    private LazySingleton() {

        // Private constructor to prevent external instantiation

    }

    public static LazySingleton getInstance() {

        if (obj == null) {

            obj = new LazySingleton();

        }

        return obj;

    }

}