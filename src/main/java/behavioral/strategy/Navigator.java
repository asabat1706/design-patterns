package behavioral.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Navigator {
    private NavigateStrategy navigateStrategy;

    public void navigate(String from, String to){
        navigateStrategy.navigate(from,to);
    }
}
