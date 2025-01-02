package decorator;

public class RoundedBorder extends ComponentDecorator{
    public RoundedBorder(Component component) {
        super(component);
    }

    @Override
    public String render() {
        return "RoundedBorder(" + super.render() + ")";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "add:\t" + "Rounded Borders\n";
    }
}
