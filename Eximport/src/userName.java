import java.util.Scanner;

public class userName {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter UserName");

        String userName = myObj.nextLine();
        System.out.println("UserName is " + userName);

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Enter name, age, and salary: ");

        String name = myObj2.nextLine();
        int age =  myObj2.nextInt();
        double salary = myObj2.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}