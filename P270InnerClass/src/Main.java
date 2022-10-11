class OuterClass {

    int x = 10;

    class InnerClass{
        int y = 5;

        public int myInnerMethod() {
            // 내부 클래스에서 외부 벨류값에 접근
            return x;
        }
    }
}

class Main {
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();

        //내부 클래스에 접근할수 있는 생성자 형식
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        //내부필드 접근
        System.out.println(myInner.y + myOuter.x);
        //내부 매소드 접근
        System.out.println(myInner.myInnerMethod());
    }
}
