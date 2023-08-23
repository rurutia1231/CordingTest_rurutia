import java.util.HashMap;

class Solution {
    public String solution(int age) {
        HashMap<Integer, String> test = new HashMap<>();
        test.put(0, "a");
        test.put(1, "b");
        test.put(2, "c");
        test.put(3, "d");
        test.put(4, "e");
        test.put(5, "f");
        test.put(6, "g");
        test.put(7, "h");
        test.put(8, "i");
        test.put(9, "j");

        String answer = "";
        String ageTrans = Integer.toString(age);
        
        for (char i : ageTrans.toCharArray()) {
            answer += test.get(Character.getNumericValue(i));
        }
        return answer;
    }
}