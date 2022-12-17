package factory.factorymethod;

import factory.model.Button;
import factory.model.PrimaryButton;

public class PrimaryButtonfactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
