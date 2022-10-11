class Product2 {
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price/10);
    }
}

class Tv2 extends Product2{
    Tv2(){
        super(100);
    }
    public String toString() {
        return "TV";
    }
}

class Computer2 extends Product2{
    Computer2() {
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

class Audio2 extends Product2{
    Audio2() {
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}
class Buyer2{
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    //Product2 클래스 형태의 길이가 10인 배열을 만듦
    int i = 0;

    void buy(Product2 p){
        if(money < p.price){
            System.out.println("잔액이 부족합니다");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
/*      Buyer2의 bonusPoint  Product2의 bonusPoint  */
//        System.out.println(i);
//        System.out.println(p);
        cart[i++] = p;
//        System.out.println(cart[i-1]);
        System.out.println(p + "을/를 구매하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i =0; i< cart.length; i++) {
            if (cart[i] == null)
                break;
            sum += cart[i].price;
//          System.out.println("itemList::::" + itemList);
//          System.out.println("price:::" + cart[i].price);
            itemList += cart[i] + ", ";
//          itemList += (i==0) ? "" + cart[i] : ", " + cart[i];
//          System.out.println(itemList);
        }

        System.out.println("구입하신 물품의 총금액은" + sum + "만원입니다.");
        System.out.println("구입하신 제품은" + itemList + "입니다.");
    }
}
public class Ex7_9 {
    public static void main(String[] args){
        Buyer2 b = new Buyer2();
/*      Buyer2 생성자 만듦     */

        b.buy(new Tv2());
/*      Buyer2클래스에는 buy, summary라는 매서드가 있을 것이다.
        buy는 매개변수가 있어야한다(매개변수의 다형성)   */
        b.buy(new Computer2());
        b.buy(new Audio2());
        System.out.println(":::::");

        //b.buy()를 배열로 만들기

        //조상타입의 참조변수로 자손타입의 인스턴스를 참고하는것이 가능함
        Product2[] item = {new Tv2(), new Computer2(), new Audio2()};
            for(int i=0; i < item.length; i++){
                b.buy(item[i]);
            }

        //배열에 값에 int, string만 넣어옴
        //배열에 생성자를 넣기위해서
        // 부모클래스로 배열 형식을 지정함
        b.summary();
    }
}
