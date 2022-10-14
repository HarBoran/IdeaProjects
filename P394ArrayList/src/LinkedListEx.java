import java.util.LinkedList;

class LinkedListEx {
    public static void main(String[] args){
        LinkedList<String> cars= new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.addFirst("Mazda");
        System.out.println(cars);

        cars.addLast("Mazda");
        System.out.println(cars);

        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        System.out.println(cars);
    }
}