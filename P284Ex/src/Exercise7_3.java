class Product{
    int price;
    int bonusPoints;
    Product(){} // 기본 생성자 추가

    Product(int price){
        this.price = price;
        bonusPoints = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv(){} //조상클래스에 기본 생성자가 없어서 오류남
//  Tv(){super();}
    public String toString(){
        return "Tv";
    }
}

class Exercise7_3 {
    public static void main(String[] args){
        Tv t = new Tv();
    }
}
