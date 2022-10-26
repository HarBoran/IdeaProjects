import java.util.ArrayList;
import java.util.Iterator;

public class ExceptionEx1 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        System.out.println(cars);
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        //hasNext = boolean
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
