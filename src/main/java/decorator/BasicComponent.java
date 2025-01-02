package decorator;

public class BasicComponent implements Component{
    @Override
    public String render() {
        return "|Basic Component|";
    }

    @Override
    public String getDescription() {
        return "* New Basic component\n";
    }
}
