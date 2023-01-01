package builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Student {
    String fname;
    String lname;
    String email;
    String phone;
    String address;

}
