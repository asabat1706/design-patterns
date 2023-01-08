package strategytest;

import behavioral.strategy.CarStrategy;
import behavioral.strategy.Navigator;
import org.junit.Test;

public class MapNavigationTest {

    @Test
    public void testCarNavigation(){
        Navigator navigator = new Navigator(new CarStrategy());
        navigator.navigate("A","B");
    }
}
