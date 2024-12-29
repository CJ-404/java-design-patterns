import factory.FactoryPatternDemo;
import singletone.SingletonPatternDemo;

public class Main {

    public static void main(String[] args)
    {
        new SingletonPatternDemo().run();

        new FactoryPatternDemo().run();
    }

}
