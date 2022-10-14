import java.util.HashSet;

class HashSetEx {
    public static void main(String[] args){
        HashSet<String> cars= new HashSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.contains("Mazda"));
        cars.remove("Volvo");
        System.out.println(cars);
    }
}