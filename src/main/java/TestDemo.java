import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<> ();
        list.add ("hello");
        list.add ("hello");
        list.add ("world");
        list.add ("learn");
        Set<String> set = new HashSet<> ();
        set.addAll (list);
        System.out.println (set.size ());
    }
}
