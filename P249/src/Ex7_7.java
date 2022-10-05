import java.sql.SQLOutput;

class Ex7_7 {
    public static void main(String[] args) {
        Car car =null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//      car.wather();
        fe2 = (FireEngine)car;
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("dirbe, Brrrrrr~");
    }

    void stop() {
        System.out.println("stop!!");
    }
}

class  FireEngine extends Car {
    void water() {
        System.out.println("water!!");
    }
}