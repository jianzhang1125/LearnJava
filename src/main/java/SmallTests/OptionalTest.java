package SmallTests;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional test = Optional.ofNullable(null);
        System.out.println(test.isPresent());
    }
}
