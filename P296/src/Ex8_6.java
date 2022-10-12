import java.util.concurrent.TimeUnit;

class Ex8_6 {
    public static void main(String[] args){
      try{
          throw new Exception("고의로 발생시켰음");
//        Exception e = new Exception("고의로 발생 시켰음");
//        throw e;

      } catch (Exception e){
          System.out.println("에러메세지 : " + e.getMessage());
          e.printStackTrace();
      }
        System.out.println("프로그램이 정상 종료 되었음");
    }
}
