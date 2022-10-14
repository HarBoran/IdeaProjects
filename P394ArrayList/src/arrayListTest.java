//10, 15, 20, 25로 이루어진 arrayList를 만드세요
//위 숫자가 하나씩 출력 되도록 두가지 for문을 작성하세요

import java.util.ArrayList;

public class arrayListTest {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.println(list);

for(int i = 0; i < list.size(); i++){
    System.out.print(list.get(i) + " ");
}
        System.out.println();

for(int i : list) {
    System.out.print(i+ " ");
}

    }
}