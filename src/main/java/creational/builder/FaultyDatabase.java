package creational.builder;

import java.util.Map;


public class FaultyDatabase {
    private String databaseName;
    private String host;
    private int port;
    private String username;
    private String password;
    private DatabaseType type;

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public DatabaseType getType() {
        return type;
    }

      public FaultyDatabase(String databaseName, String host, int port, String username, String password, DatabaseType type) {
        if(password.equals("testdb")){
            throw new RuntimeException();
        }
        this.databaseName = databaseName;
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.type = type;
    }
//    for telescopic antipattern
    public FaultyDatabase(String host, int port) {
        this(null,host,port,null,null,null);
    }

    public FaultyDatabase(Map<String,Object> values){
        this.host = (String) values.get("host");
        this.port = (Integer) values.get("port");
        this.type = (DatabaseType) values.get("type");
    }


    public FaultyDatabase(){ }
}
