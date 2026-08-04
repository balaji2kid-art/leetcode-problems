import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length)
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);

            if (!map1.containsKey(ch))
                map1.put(ch, i);

            if (!map2.containsKey(words[i]))
                map2.put(words[i], i);

            if (!map1.get(ch).equals(map2.get(words[i])))
                return false;
        }

        return true;
    }
}