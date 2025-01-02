package decorator;
import common.PatternDemo;
import java.util.List;

public class DecoratorPatternDemo implements PatternDemo {

    @Override
    public void run() {
        Component component = new BasicComponent();
        Component roundedComponent = new RoundedBorder(component);

        component = new ListView(List.of(roundedComponent,component,roundedComponent));

        component = new Scrollable(component);

        System.out.println("---------------------------\nRender the created component\n---------------------------");
        System.out.println(component.render());

        System.out.println("-------------------------------\nDescription of the created Component\n-------------------------------");
        System.out.println(component.getDescription());
    }
}
