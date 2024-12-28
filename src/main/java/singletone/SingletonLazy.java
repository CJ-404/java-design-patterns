package singletone;

public class SingletonLazy implements Singleton {

    private static SingletonLazy instance;
    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if(instance == null)
        {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static synchronized SingletonLazy getInstanceThreadSafe()
    {
        if(instance == null)
        {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static SingletonLazy getInstanceThreadSafeOptimized()
    {
        if(instance == null)
            synchronized (SingletonLazy.class)
            {
                if(instance == null)
                {
                    instance = new SingletonLazy();
                }
            }
        return instance;
    }

}
