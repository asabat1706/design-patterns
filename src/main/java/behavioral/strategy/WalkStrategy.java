package behavioral.strategy;

public class WalkStrategy implements NavigateStrategy{

    @Override
    public void navigate(String from, String to) {
        System.out.println("navgiate walk route");
    }
}
