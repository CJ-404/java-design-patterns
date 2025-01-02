import builder.BuilderPatternDemo;
import composite.CompositePatternDemo;
import decorator.DecoratorPatternDemo;
import facade.FacadePatternDemo;
import factory.FactoryPatternDemo;
import prototype.ProtoypePatternDemo;
import proxy.ProxyPatternDemo;
import singletone.SingletonPatternDemo;

public class Main {

    public static void main(String[] args)
    {
        Class activePattern = DecoratorPatternDemo.class;

        if(activePattern == SingletonPatternDemo.class || activePattern == null)
            new SingletonPatternDemo().run();

        if(activePattern == FactoryPatternDemo.class || activePattern == null)
            new FactoryPatternDemo().run();

        if(activePattern == BuilderPatternDemo.class || activePattern == null)
            new BuilderPatternDemo().run();

        if(activePattern == ProtoypePatternDemo.class || activePattern == null)
            new ProtoypePatternDemo().run();

        if(activePattern == ProxyPatternDemo.class || activePattern == null)
            new ProxyPatternDemo().run();

        if(activePattern == FacadePatternDemo.class || activePattern == null)
            new FacadePatternDemo().run();

        if(activePattern == CompositePatternDemo.class || activePattern == null)
            new CompositePatternDemo().run();

        if(activePattern == DecoratorPatternDemo.class || activePattern == null)
            new DecoratorPatternDemo().run();
    }

}
