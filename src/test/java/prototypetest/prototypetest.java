package prototypetest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import creational.prototype.BackgroundObjType;
import creational.prototype.BackgroundObject;
import creational.prototype.GenericRegistry;

public class prototypetest {

    private GenericRegistry<BackgroundObjType,BackgroundObject> registry;

    @Before
    public void setup(){
        registry = new GenericRegistry<>();
        BackgroundObject prototype = new BackgroundObject(0,0,0,0, BackgroundObjType.TREE);
        registry.store(BackgroundObjType.TREE, prototype);
    }

    @After
    public void teardown(){
        registry = null;
    }

    @Test
    public void testCloning(){
        BackgroundObject prototype = new BackgroundObject(0,0,0,0, BackgroundObjType.TREE);
        BackgroundObject clone = prototype.clone();
        clone.setX(1);
        clone.setY(1);
        Assert.assertNotEquals("Different objects "+prototype.hashCode(),clone.hashCode());
    }

    @Test
    public void registryTest(){
        BackgroundObject clone = registry.get(BackgroundObjType.TREE);
        Assert.assertNotNull("clone tree should not be null" , clone);
    }
}
