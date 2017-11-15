package week4;

public class Singleton {

    private static int COUNT_OF_INSTANCE = 0;
    private final String name = "some name";

    private static Singleton INSTANCE;

    private Singleton(){
        COUNT_OF_INSTANCE++;
    }

    // Lazy initialisation
    public static Singleton getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Singleton{");
        sb.append("name='").append(name).append('\'');
        sb.append(", count of instance - ").append(COUNT_OF_INSTANCE);
        sb.append('}');
        return sb.toString();
    }
}
