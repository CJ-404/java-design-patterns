import singletone.SingletonEager;
import singletone.SingletonLazy;

public class Main {

    public static void main(String[] args)
    {
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
    }
}
