public class Main {
    public static void main(String[] args){


        //setter를 활용하여 자동차 특성을 입력함
        Car car1 = new Car();
        car1.setModel("K5");

        //getter를 이용하여 특성값을 가져오고 출력함
//        switch (car1.getModel()){
//            case "K5": case "소나타":
//                System.out.println("새로운 모델은 " + car1.getModel() + "입니다");
//                break;
//            default:
//                System.out.println("허용되지 않는 모델입니다.");
//                break;
//        }
        System.out.println("새자동차 모델의 이름은 " + car1.getModel() + "입니다.");
        //System.out.println(car1.getModel());
    }
}