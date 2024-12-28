package singletone;

public class SingletonEager implements Singleton {

    private static final SingletonEager instance = new SingletonEager();
    private SingletonEager(){}

    public static SingletonEager getInstance()
    {
        return instance;
    }
}
