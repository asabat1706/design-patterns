package simplefactorytest;

import creational.factory.model.Button;
import creational.factory.simplefactory.ButtonFactory;
import creational.factory.simplefactory.Platform;
import creational.factory.model.RoundButton;
import org.junit.Assert;
import org.junit.Test;

public class ButtonFactoryTest {

    @Test
    public void testButton(){
        Button roundButton  = ButtonFactory.createButton(Platform.IOS);
        Assert.assertTrue("Round Button instance created ", roundButton instanceof RoundButton);
    }
}
