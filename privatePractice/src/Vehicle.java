class Vehicle {

    //  protected String brand = "ionic";
    private String brand = "ionic";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void carAd() {
        System.out.println("New Car Ad");
    }
}

class Car extends Vehicle{
    private String modelName = "electronic cars";
    public static void main(String[] args){

        Car myCar = new Car();
        myCar.carAd();
        myCar.setBrand("NewIonic");
//      System.out.println(myCar.brand + " is a model of " + myCar.modelName);
        System.out.println(myCar.getBrand() + " is a model of " + myCar.modelName);
    }
}