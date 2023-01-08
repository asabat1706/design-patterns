package creational.factory.simplefactory;

import creational.factory.model.Button;
import creational.factory.model.PrimaryButton;
import creational.factory.model.RoundButton;

//Step3: Create Factory class
public class ButtonFactory {

//    Step4: create static creational.factory method
    public static Button createButton(Platform platform){
        switch(platform){
            case IOS:
                return new RoundButton();
            case ANDROID:
                return new PrimaryButton();
        }
        throw new RuntimeException("no platform matched");
    }
}
