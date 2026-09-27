class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000
        ); //map the characters to their integer complement

        int result = 0; //initialize result

        for (int i = 0; i < s.length(); i++) { //loop trough string s
            int current = map.get(s.charAt(i)); //get the character at the current index
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0; //get next value while i + 1 is smaller than s: if it is, return the character at that index, if it isnt return 0 instead

            if (current < next) { //while current value is smaller than next..
                result -= current; //..subtract the current
            } else { //Otherwise..
                result += current; //..add the current to the result
            }
        }
        return result;
    }
}
