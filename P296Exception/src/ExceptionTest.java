import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExceptionTest {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        System.out.println("Integer numbers" + numbers);

        int[] n = {12, 8, 2, 23};

//        for(int i : n) {
//            System.out.println(n[i]);
//        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }

        System.out.println(it);
        System.out.println(numbers.get(0));
        System.out.println(numbers);
    }
}
