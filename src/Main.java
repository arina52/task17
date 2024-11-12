import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.ArrayDeque;
public class Main{

    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("first", "object1");
        map.put("second", "object2");
        map.put("third", "object3");

        Map <String, String> map2 = new HashMap<>(map);
        for(String key: map2.keySet()){
            System.out.println(key);
        }

        System.out.println();
        Queue<String> queue = new ArrayDeque<>(map.keySet());
        for(String key: queue) {
            System.out.println(key);
        }
        System.out.println();

        ArrayDeque<String> stack = new ArrayDeque<>(map.keySet());
        for(String key: stack) {
            System.out.println(key);
        }
        System.out.println();

        Map<Integer, String> map3 = new HashMap<>();
        int index=0;
        for(String key: queue){
            map3.put(index++, key);
        }

        for(Integer key: map3.keySet()) {
            System.out.println(key);
        }

    }
}