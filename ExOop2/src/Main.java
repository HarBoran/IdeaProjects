public class Main {
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating object");
        //객체를 생성하지 않고 정적 메서드를 호출할 수 있습니다.
    }

    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating object");
        //공개 메서드는 개체를 생성하여 호출해야 합니다.
    }

    public static void main(String[] args){
        myStaticMethod();

        Main myObj = new Main();
        myObj.myPublicMethod();

        Main myObj1 = new Main();
        myObj1.myPublicMethod();
    }
}