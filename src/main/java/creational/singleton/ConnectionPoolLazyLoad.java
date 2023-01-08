package creational.singleton;

public class ConnectionPoolLazyLoad {
//    instance var
    private static ConnectionPoolLazyLoad instance;

//    hiding the ctor
    private ConnectionPoolLazyLoad(){}

//    global access point with double check locking technique
    public static ConnectionPoolLazyLoad getInstance(){
        if(instance == null) {
            synchronized (ConnectionPoolLazyLoad.class) {
                if (instance == null) {
                    instance = new ConnectionPoolLazyLoad();
                }
            }
        }
        return instance;
    }
}
