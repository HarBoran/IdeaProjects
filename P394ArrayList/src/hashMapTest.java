//hashMap을 사용하여 사람 3명의 이름과 그들의 나이를 연계한 데이터를 만들고,
//이름 : ___ 나이 : __ 와 같이 출력 되로록하세요

import java.util.HashMap;

class hashMapTest {
    public static void main(String[] args) {

        HashMap<String, Integer> age = new HashMap<>();
        age.put("첫째", 3);
        age.put("둘째", 2);
        age.put("셋째", 1);

        System.out.println(age);
        System.out.println(age.keySet());

        for (String i : age.keySet()){
            System.out.println("이름 : " + i + " 나이 : " + age.get(i));
        }
    }
}
