import java.util.HashMap;
import java.util.Set;

public class DuplicateWord {


    public static void main(String[] args) {

        String txt="Getting real for women, Women deserve transparency in advertising. That’s why CVS Pharmacy stands for" +
                " representing beauty as it really is, and all our beauty imagery is labeled digitally unaltered or otherwise.";

        String item[] = txt.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : item) {
            if (map.containsKey(t)) {
                    map.put(t, map.get(t) + 1);

            } else {
                    map.put(t, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
                System.out.println(key);
                System.out.println(map.get(key));
        }

    }
}
