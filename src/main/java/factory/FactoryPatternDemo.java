package factory;

import common.PatternDemo;

public class FactoryPatternDemo implements PatternDemo {
    @Override
    public void run() {

        Controller userController = ControllerFactory.getInstance("user", "createUser");
        Controller companyController = ControllerFactory.getInstance("company", "getAllCompany");

        userController.run();
        companyController.run();
    }
}
