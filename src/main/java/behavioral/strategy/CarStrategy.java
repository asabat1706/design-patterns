package behavioral.strategy;

public class CarStrategy implements NavigateStrategy{

    @Override
    public void navigate(String from, String to) {
        System.out.println("navgiate car route");
    }
}
