import java.util.HashMap;

public class Qhash {
    public static void main(String[] args) {
        HashMap<String, Integer>map = new HashMap<>();

        map.put("car ",89000);
        map.put("CyberWare",55000);

        map.put("optics",450);
        map.put("RamJolts",20);
        //for printing key value pair
        for (String i : map.keySet()) {
            System.out.println("key " + i + " value " + map.get(i));
        }
        System.out.println(map);
    }
}
