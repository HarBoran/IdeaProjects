import java.util.ArrayList;

class arrayListEx1 {
    public static void main(String[] args){

        ArrayList<String> cars= new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println(cars.size());
        cars.set(0,"Opel");
        System.out.println(cars.get(0));
        cars.remove(0);


        for(int i =0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        for(String i :cars) {
            System.out.println(i);
        }

        cars.clear();

    }
}