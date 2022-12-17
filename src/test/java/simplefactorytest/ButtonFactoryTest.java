package simplefactorytest;

import factory.model.Button;
import factory.simplefactory.ButtonFactory;
import factory.simplefactory.Platform;
import factory.model.RoundButton;
import org.junit.Assert;
import org.junit.Test;

public class ButtonFactoryTest {

    @Test
    public void testButton(){
        Button roundButton  = ButtonFactory.createButton(Platform.IOS);
        Assert.assertTrue("Round Button instance created ", roundButton instanceof RoundButton);
    }
}
