package factorymethodtest;

import factory.factorymethod.PrimaryButtonfactory;
import factory.model.Button;
import factory.model.PrimaryButton;
import factory.model.RoundButton;
import factory.factorymethod.PrimaryButtonfactory;
import factory.factorymethod.ButtonFactory;
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
