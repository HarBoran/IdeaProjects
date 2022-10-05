public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String color;

    public String getModel() {
        return model;
    }

//        일정한 두가지 모델 외에 value를 입력했을 경우
//        "허용되지 않는 모델입니다." 라고 출력이 되게 하시고
//        위 두가지 모델의 경우에는 "새로운 모델은 ~입니다"로 출력이 되게 하세요

//    public String getModel() {
//        String model2 = getModel();
//        switch (model2){
//            case "K5": case "소나타":
//                return model();
//                System.out.println("새로운 모델은" + model() + "입니다");
//                break;
//            default:
//                System.out.println("허용되진 않는 모델입니다.");
//                break;
//        }
//    }

    public void setModel(String model) {
        String model1 = model;
        if(model1=="K5" || model1=="소나타"){
            this.model = model;
        }else{
            this.model = "하용되지 않는 모델";
        }
    }

//    public void setModel(String model) {
//        this.model = model;
//    }
}