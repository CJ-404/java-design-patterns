package decorator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class MultiComponentDecorator implements Component{
    public List<Component> components;

    public MultiComponentDecorator(List<Component> components)
    {
        this.components = components;
    }

    @Override
    public String render() {
        return components.stream().map(Component::render).collect(Collectors.joining(",\n\t"));
    }

    @Override
    public String getDescription() {
        return components.stream().map(Component::getDescription).collect(Collectors.joining(""));
    }
}
