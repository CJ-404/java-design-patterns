package facade;

import java.util.List;

public class DatabasePdo {
    public static boolean execQuery(String dbDriver, String query) {
        DatabaseDriver driver;
        driver = switch (dbDriver){
            case "mysql" -> new MySqlDriver();
            case "postgresql" -> new PostgreSqlDriver();
            default -> throw new IllegalStateException("Unexpected driver: " + dbDriver);
        };

        return driver.execQuery(query);
    }

    public static List<String> select(String dbDriver, String table, List<String>columns, String conditions)
    {
        DatabaseDriver driver = switch (dbDriver){
            case ("mysql") -> new MySqlDriver();
            case ("postgresql") -> new PostgreSqlDriver();
            default -> throw new IllegalStateException("Unexpected driver: "+ dbDriver);
        };

        return driver.select(table,columns,conditions);
    }
}
