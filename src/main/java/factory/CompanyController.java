package factory;

public class CompanyController implements Controller {
    public String action;

    public CompanyController(String action)
    {
        this.action = action;
    }
    @Override
    public void run() {
        System.out.printf("Running action %s from controller %s\n", action,this.getClass());
    }
}
