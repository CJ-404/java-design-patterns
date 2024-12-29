package factory;

public class ControllerFactory {

    public static Controller getInstance(String type, String action)
    {
        return switch (type) {
            case ("user") -> new UserController(action);
            case ("company") -> new CompanyController(action);
            default -> null;
        };

    }
}
