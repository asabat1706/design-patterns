package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BackgroundRegistry {
    private Map<BackgroundObjType,BackgroundObject> registry = new HashMap<>();

    public void store(BackgroundObjType type, BackgroundObject backgroundObject){
        registry.put(type,backgroundObject);
    }

    public BackgroundObject get(BackgroundObjType type){
        return registry.get(type);
    }
}
