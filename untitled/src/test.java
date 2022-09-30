public class test {
    public static void main(String[] args){

        String model = "소나타";
        switch (model){
            case "K5": case "소나타":
                System.out.println(" 모델입니다.");
            break;
            default:
                System.out.println("허용되진 않는 모델입니다.");
                break;
        }

    }
}
