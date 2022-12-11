package buildertestpckg;

import builder.Database;
import builder.DatabaseType;
import builder.FaultyDatabase;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ValidateBuilder {

    @Test
    public void testConstructor(){
        FaultyDatabase db = new FaultyDatabase("devdb","localhost", 4533, "testdb", "testdb", DatabaseType.MYSQL);
        Assert.assertNotNull(db);
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidPassword(){
        FaultyDatabase db = new FaultyDatabase("devdb","localhost", 4533, "testdb", "testdb", DatabaseType.MYSQL);
        Assert.assertNotNull(db);
    }

    @Test
    public void testMapConstructor(){
        Map<String,Object> map = new HashMap<>();
        map.put("host","localhost");
        map.put("port",3306);
        map.put("type",DatabaseType.MYSQL);

        FaultyDatabase database = new FaultyDatabase(map);
        Assert.assertEquals("compare host : ","localhost",database.getHost());
    }

    @Test
    public void testDatabaseBuilder() {
        Database database = Database.builder().
                mysql().
                withUrl("localhost", 8080).
                withName("testdb").
                build();
        Assert.assertNotNull("If build method is called, database object should not be null", database);
        Assert.assertEquals("compare host : ","localhost", Database.properties().getHost());
        Assert.assertEquals("If mysql is set, on fetching it should be the same", DatabaseType.MYSQL, Database.properties().getType());
        Assert.assertEquals("If name is set, on fetching it should be the same", "testdb", Database.properties().getDatabaseName());
    }
}
