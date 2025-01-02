package decorator;

public abstract class ComponentDecorator implements Component {
    protected Component component;

    public ComponentDecorator(Component component)
    {
        this.component = component;
    }

    @Override
    public String render() {
        return component.render();
    }

    @Override
    public String getDescription() {
        return component.getDescription();
    }
}
