import java.util.Scanner;

class Exercise8_7 {
    public static void main(String[] args) {

        int answer = (int) (Math.random() * 10) + 1;
        int input = 0;
        int count = 0;

        do {
        count++;
        System.out.println("1과 10사이의 값을 입력하세요");

        try{
//          Scanner myObj = new Scanner(System.in);
//          input = myObj.nextInt();
//          한줄로
            input = new Scanner(System.in).nextInt();
        }catch (Exception e){
                System.out.println("유효하지 않은 값입니다");
                continue;
        }
                if (answer > input) {
                    System.out.println("더큰수를 입력하세요");
                } else if (answer < input) {
                    System.out.println("더 작은수를 입력하세요");
                } else {
                    System.out.println("맞췄습니다");
                    System.out.println("시도 횟수는 " + count + "번입니다");
                    break;
                }
        }while(true);
    }
}
