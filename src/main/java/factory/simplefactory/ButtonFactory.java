package factory.simplefactory;

import factory.model.Button;
import factory.model.PrimaryButton;
import factory.model.RoundButton;

//Step3: Create Factory class
public class ButtonFactory {

//    Step4: create static factory method
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
