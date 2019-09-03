package main.java.prep.hackerrank.interviewprep.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author sharifahmed
 * @since 8/6/19
 */
public class RansomNote {

    public static void main(String[] args) {
        checkMagazine(new String[]{"give", "me", "one", "grand", "today", "night"},
                new String[]{"give", "one", "grand", "today"});
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        for (String s : magazine) {
            if (Objects.isNull(magazineMap.get(s))) {
                magazineMap.put(s, 1);
            } else {
                magazineMap.put(s, magazineMap.get(s) + 1);
            }
        }

        for (String s : note) {
            if (Objects.isNull(magazineMap.get(s))) {
                System.out.println("No");
                return;
            } else {
                if (magazineMap.get(s) == 0) {
                    System.out.println("No");
                    return;
                } else {
                    magazineMap.put(s, magazineMap.get(s) - 1);
                }
            }
        }

        System.out.println("Yes");
    }
}
