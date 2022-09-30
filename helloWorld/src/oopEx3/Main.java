package oopEx3;

abstract class Main {  // 추상화 - 구체화가 필요한 클래스
    public String fname = "John";
    public int age = 24;
    public abstract void study(); //abstract  method
}

class Student extends Main { // 상속 및 구체화
    public int graduationYear = 2018;

    public void study() {
        System.out.println("Studying all day long");
    }
}

class Second{
    public static void main(String[] args){
        Student myObj = new Student();
        //Main test = new Main();
        System.out.println("name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); //cal abstract method
    }
}