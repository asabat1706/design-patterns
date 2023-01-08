package creational.singleton;

public class ConnectionPoolEagerLoad {
    //    instance var
    private static ConnectionPoolEagerLoad instance = new ConnectionPoolEagerLoad();

    //    hiding the ctor
    private ConnectionPoolEagerLoad(){}

    //    global access point
    public static ConnectionPoolEagerLoad getInstance(){
        return instance;
    }

}
