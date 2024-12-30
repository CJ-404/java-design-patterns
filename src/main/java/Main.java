import builder.BuilderPatternDemo;
import facade.FacadePatternDemo;
import factory.FactoryPatternDemo;
import prototype.ProtoypePatternDemo;
import proxy.ProxyPatternDemo;
import singletone.SingletonPatternDemo;

public class Main {

    public static void main(String[] args)
    {
        new SingletonPatternDemo().run();

        new FactoryPatternDemo().run();

        new BuilderPatternDemo().run();

        new ProtoypePatternDemo().run();

        new ProxyPatternDemo().run();

        new FacadePatternDemo().run();
    }

}
