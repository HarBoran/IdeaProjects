public class oopOne {
    //final int x=5;
    int x = 9;

    //multiple attribtue
    String t = "Weekend is coming";


    public static void main(String[] args){
        oopOne myObj = new oopOne();
        oopOne myObj1 = new oopOne();
        int x = 7;
        myObj1.x = 6; // final 한정어 //odifinal
        System.out.println(myObj.x);
        System.out.println(myObj1.x);
        System.out.println(myObj.t);
    }
}
