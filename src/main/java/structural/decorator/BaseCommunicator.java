package structural.decorator;

import structural.decorator.interfaces.CommunicatorService;

//Step2: Basic Service Implementation
public class BaseCommunicator implements CommunicatorService {
    @Override
    public String send(String from, String to) {
        return "-sending email-";
    }
}
