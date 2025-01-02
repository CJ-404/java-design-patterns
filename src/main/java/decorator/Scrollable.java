package decorator;

public class Scrollable extends ComponentDecorator{
    public Scrollable(Component component) {
        super(component);
    }

    @Override
    public String render() {
        return "Scrollable(\n" + super.render() + "\n)";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "add:\t" + "Scrollable functionality\n";
    }
}
