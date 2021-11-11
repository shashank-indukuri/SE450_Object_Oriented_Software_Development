package Q3;

import java.util.ArrayList;

public class SingletonAssignment3 {
    private static final ArrayList<SingletonAssignment3> instance = new ArrayList<SingletonAssignment3>(3) ;

    private SingletonAssignment3() {

    }

    public static SingletonAssignment3 getInstance() {
        int length = instance.size();
        if (length < 3) {
            instance.add(new SingletonAssignment3());
            length = instance.size();
        } else {
            System.out.println("You cannot create more than three instances");
            System.out.println("Last created instance is:");
        }
        return instance.get(length-1);
    }
}
