package testprojecs;

public class PrivateConstructor {
    private static PrivateConstructor instance;
    
    // Private constructor
    private PrivateConstructor() {
  
    }
    
    public static PrivateConstructor getInstance() {
        if (instance == null) {
            instance = new PrivateConstructor();
        }
        return instance;
    }
}
