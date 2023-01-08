package creational.factory.factorymethod;

import creational.factory.model.Button;
import creational.factory.model.RoundButton;

public class RoundButtonfactory implements ButtonFactory{

    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
