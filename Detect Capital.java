class Solution {
    public boolean detectCapitalUse(String word) {
        int caps = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) caps++;
        }
        if (caps == 0 || caps == word.length()) return true;
        if (caps == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}
