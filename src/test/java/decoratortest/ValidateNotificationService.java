package decoratortest;

import structural.decorator.*;
import structural.decorator.interfaces.CommunicatorService;
import structural.decorator.interfaces.SlackDecorator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidateNotificationService {
    private CommunicatorService communicatorService = null;

    @Before
    public void setup(){
        communicatorService = new BaseCommunicator();
    }

    @Test
    public void testEmailNotification(){
        Assert.assertEquals("-sending email-",communicatorService.send("A","B"));
    }

    @Test
    public void testTextNotification(){
        CommunicatorService textAndMail = new TextDecorator(communicatorService);
        Assert.assertEquals("-sending email--Sending text-",textAndMail.send("A","B"));
    }

    @Test
    public void testAllNotification(){
        CommunicatorService textAndMail = new TextDecorator(communicatorService);
        CommunicatorService slackAndtextAndMail = new SlackDecorator(textAndMail);
        Assert.assertEquals("-sending email--Sending text--Sending slack text-",slackAndtextAndMail.send("A","B"));
    }
}
