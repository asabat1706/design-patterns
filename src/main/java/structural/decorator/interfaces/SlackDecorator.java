package structural.decorator.interfaces;

import structural.decorator.*;
import lombok.AllArgsConstructor;

//Step4 - Implementation classes
@AllArgsConstructor
public class SlackDecorator extends BaseDecorator{
    private CommunicatorService communicatorService;

    @Override
    public String send(String from, String to) {
        return communicatorService.send(from, to)+"-Sending slack text-";
    }
}
