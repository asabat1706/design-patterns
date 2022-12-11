package builder;

import lombok.Getter;

public class Database {
    private static DatabaseDetails databaseDetails = new DatabaseDetails();

//    Step1: private ctor
    private Database(){}

    public static DatabaseDetails properties(){
        return databaseDetails;
    }

    public static DatabaseBuilder builder(){
        return new DatabaseBuilder();
    }

//    Step2: create a static inner class
    public static class DatabaseBuilder{

//    Step3:copy all database data
    private final DatabaseDetails databaseDetails = new DatabaseDetails();

//    Step4: create fluent interfaces
    public DatabaseBuilder withUrl(String host, int port){
        this.databaseDetails.host = host;
        this.databaseDetails.port = port;
        return this;
    }

    public DatabaseBuilder mysql(){
        this.databaseDetails.type = DatabaseType.MYSQL;
        return this;
    }

    public DatabaseBuilder withName(String name){
        this.databaseDetails.databaseName = name;
        return this;
    }

//    Step5: create a builder method
    public Database build(){
        Database database = new Database();
        Database.databaseDetails.host = this.databaseDetails.host;
        Database.databaseDetails.port = this.databaseDetails.port;
        Database.databaseDetails.type = this.databaseDetails.type;
        Database.databaseDetails.databaseName = this.databaseDetails.databaseName;
        return database;
    }

    }

    @Getter
    public static class DatabaseDetails{
        private String databaseName;
        private String host;
        private int port;
        private String username;
        private String password;
        private DatabaseType type;
    }
}
