package structural.decorator;

import structural.decorator.interfaces.BaseDecorator;
import structural.decorator.interfaces.CommunicatorService;
import lombok.AllArgsConstructor;

//Step4 - Implementation classes
@AllArgsConstructor
public class TextDecorator extends BaseDecorator {
    private CommunicatorService communicatorService;

    @Override
    public String send(String from, String to) {
        return communicatorService.send(from, to)+ "-Sending text-";
    }
}
