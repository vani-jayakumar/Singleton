public class EarlySingleton {

    private static final EarlySingleton obj = new EarlySingleton();

    private EarlySingleton() {

        // Private constructor to prevent external instantiation
    }

    public static EarlySingleton getInstance() {

        return obj;

    }

}