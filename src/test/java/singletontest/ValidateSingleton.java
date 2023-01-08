package singletontest;

import org.junit.Assert;
import org.junit.Test;
import creational.singleton.ConnectionPoolEagerLoad;
import creational.singleton.ConnectionPoolLazyLoad;

public class ValidateSingleton {

    @Test
    public void testSingletonLazy(){
        ConnectionPoolLazyLoad connectionPool = ConnectionPoolLazyLoad.getInstance();
        ConnectionPoolLazyLoad connectionPool2 = ConnectionPoolLazyLoad.getInstance();

        Assert.assertTrue("ConnectionPools are same",connectionPool.hashCode() == connectionPool2.hashCode());
    }

    @Test
    public void testSingletonEager(){
        ConnectionPoolEagerLoad connectionPool = ConnectionPoolEagerLoad.getInstance();
        ConnectionPoolEagerLoad connectionPool2 = ConnectionPoolEagerLoad.getInstance();

        Assert.assertTrue("ConnectionPools are same",connectionPool.hashCode() == connectionPool2.hashCode());
    }


}
