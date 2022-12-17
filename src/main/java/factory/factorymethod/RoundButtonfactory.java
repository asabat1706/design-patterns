package factory.factorymethod;

import factory.model.Button;
import factory.model.RoundButton;

public class RoundButtonfactory implements ButtonFactory{

    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
