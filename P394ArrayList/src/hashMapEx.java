import java.util.HashMap;

class hashMapEx {
    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Merlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities);

        capitalCities.remove("England");
        System.out.println(capitalCities);

        System.out.println(capitalCities.size());

            for (String i : capitalCities.keySet()){
                System.out.println(i);
            }

            for(String i : capitalCities.values()){
                System.out.println(i);
            }

        System.out.println(capitalCities.keySet());
        System.out.println(capitalCities.values());

            for(String i : capitalCities.keySet()) {
                System.out.println("key : " + i
                        + " value : " + capitalCities.get(i));
            }
    }
}