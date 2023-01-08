package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class GenericRegistry<T,U> {
    private Map<T,U> registry = new HashMap<>();

    public void store(T t, U u){
        registry.put(t,u);
    }

    public U get(T t){
        return registry.get(t);
    }
}
