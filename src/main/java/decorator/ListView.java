package decorator;
import java.util.List;

public class ListView extends MultiComponentDecorator{
    public ListView(List<Component> components) {
        super(components);
    }

    @Override
    public String render() {
        return "ListView(\n\t" + super.render() + "\n)";
    }

    @Override
    public String getDescription() {

        return super.getDescription() + "add:\t" + "ListView functionality\n";
    }
}
