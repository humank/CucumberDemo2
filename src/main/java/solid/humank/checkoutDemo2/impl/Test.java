package solid.humank.checkoutDemo2.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yikai on 2015/4/2.
 */
public class Test {

    class ParsingItem {
        private char candidate;
        private int idx;

        public ParsingItem(char candidate, int idx) {
            this.candidate = candidate;
            this.idx = idx;
        }
    }

    public static void main(String[] args) {

        doParse();

    }

    public static void doParse() {
        String test = "abbcccddddccbba";
        //找出出現最多字的第一個出現的位置

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < test.length(); i++) {

            Character key = Character.valueOf(test.charAt(i));
            Integer value = map.get(key);

            if (map.get(key) == null) {
                map.put(key, 1);
            } else {
                map.put(key, value + 1);
            }
        }
        int maxCount = 0;
        char candidate = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() > maxCount) {
                maxCount = entry.getValue().intValue();
                candidate = entry.getKey().charValue();
            }
        }
        System.out.println(test.indexOf(candidate));
    }
}
