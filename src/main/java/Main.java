import builder.BuilderPatternDemo;
import factory.FactoryPatternDemo;
import prototype.ProtoypePatternDemo;
import singletone.SingletonPatternDemo;

public class Main {

    public static void main(String[] args)
    {
        new SingletonPatternDemo().run();

        new FactoryPatternDemo().run();

        new BuilderPatternDemo().run();

        new ProtoypePatternDemo().run();
    }

}
