package singletone;
import common.PatternDemo;

public class SingletonPatternDemo implements PatternDemo {
    @Override
    public void run() {
        // singleton patten eager
        SingletonEager obj = SingletonEager.getInstance();
        System.out.println(obj);
        SingletonEager obj2 = SingletonEager.getInstance();
        System.out.println(obj2);


        //singleton Lazy pattern
        SingletonLazy obj3 = SingletonLazy.getInstance();
        System.out.println(obj3);
        SingletonLazy obj4 = SingletonLazy.getInstance();
        System.out.println(obj4);

        // thread safe
        SingletonLazy obj5 = SingletonLazy.getInstanceThreadSafe();
        System.out.println(obj5);
        // thread safe optimized
        SingletonLazy obj6 = SingletonLazy.getInstanceThreadSafeOptimized();
        System.out.println(obj6);
    }
}
