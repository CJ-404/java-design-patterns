package facade;

import common.PatternDemo;

import java.util.List;

public class FacadePatternDemo implements PatternDemo {


    @Override
    public void run() {
        try {
            DatabasePdo.execQuery("mysql", "Insert (1,\"charith\",\'25\') into person");
            DatabasePdo.execQuery("postgresql", "Insert (1,\"charith\",\'25\') into person");

            DatabasePdo.select("mysql","user", List.of("id","name"),"");
            DatabasePdo.select("postgresql","user", List.of("id","name"),"");

            DatabasePdo.execQuery("wrongDriver","Insert (1,\"charith\",\'25\') into person");
        }
        catch (IllegalStateException e)
        {
            System.out.println(e);
        }
    }
}
