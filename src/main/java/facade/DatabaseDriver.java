package facade;

import java.util.List;

public interface DatabaseDriver {
    boolean execQuery(String query);

    List<String> select(String table, List<String>columns, String conditions);
}
