package SmallTests;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Test {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        for(int i = 0; i < 99999999; i++){
            int test = random.nextInt(9000) + 1000;
            if(test < 1000 || test > 9999){
                System.out.println("wrong");
                break;
            }

        }

    }
}
