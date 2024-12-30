package facade;

import java.util.List;

public class MySqlDriver implements DatabaseDriver {
    public boolean execQuery(String query)
    {
        System.out.printf("Mysql: Executed query %s\n", query);
        return true;
    }

    public List<String> select(String table, List<String>columns, String conditions)
    {
        System.out.printf("Mysql: Select "+ columns + " from " + table + " " + conditions +"\n");
        return columns;
    }
}
