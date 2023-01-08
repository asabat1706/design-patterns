package behavioral.observer;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class Bitcoin {
    private double price;
}
