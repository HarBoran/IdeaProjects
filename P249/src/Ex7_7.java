class Ex7_7 {
    public static void main(String[] args) {
//      Car car = new Car();
        Car car =null;
        FireEngine fe = new FireEngine();
//        FireEngine fe2 = null;
        FireEngine fe2 = new FireEngine();

        fe.water();
        car = fe; // car = (Car)fe; 형병환 생략됨
        car.drive(); // 가능
//      car.wather(); //불가능
        fe2 = (FireEngine)car; //형변환 생략 불가능
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