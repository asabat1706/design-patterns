package creational.factory.factorymethod;

import creational.factory.model.Button;
import creational.factory.model.PrimaryButton;

public class PrimaryButtonfactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
