package SmallTests;

import java.util.*;

public class TestRef {
    public static void main(String[] args) {
        new TestRef().test();
    }

    public void test() {
        List<String> list = null;
        addToList(list);
        System.out.println(list);
    }

    public void addToList(List<String> list){
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add("1231");
        System.out.println("Inside");
        System.out.println(list);
    }
}
