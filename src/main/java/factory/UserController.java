package factory;

public class UserController implements Controller {
    public String action;

    public UserController(String action)
    {
        this.action = action;
    }

    @Override
    public void run() {
        System.out.printf("Running action %s from controller %s\n",action,this.getClass());
    }
}
