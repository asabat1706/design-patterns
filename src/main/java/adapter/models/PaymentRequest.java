package adapter.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PaymentRequest {
    String email;
    int phone;
    String name;
}
