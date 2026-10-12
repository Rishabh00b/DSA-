class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] w = s.split(" ");

        if (pattern.length() != w.length) return false;

        HashMap<Character, String> hm = new HashMap<>();
        HashMap<String, Character> hm2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = w[i];

            if (hm.containsKey(c)) {
                if (!hm.get(c).equals(word)) return false;
            } else {
                hm.put(c, word);
            }

            if (hm2.containsKey(word)) {
                if (hm2.get(word) != c) return false;
            } else {
                hm2.put(word, c);
            }
        }
        return true;
    }
}
