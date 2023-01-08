package factorymethodtest;

import creational.factory.factorymethod.PrimaryButtonfactory;
import creational.factory.model.Button;
import creational.factory.model.PrimaryButton;
import creational.factory.factorymethod.ButtonFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactoryMethodTest {

    private ButtonFactory factory;

    @Before
    public void setup(){
        factory = new PrimaryButtonfactory();
    }

    @Test
    public void testButton(){
        Button primaryButton = factory.createButton();
        Assert.assertTrue("Primary Button instance created ", primaryButton instanceof PrimaryButton);
    }
}
