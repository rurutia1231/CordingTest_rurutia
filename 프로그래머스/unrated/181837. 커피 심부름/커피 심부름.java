import java.util.Arrays;

class Solution {
    public int solution(String[] order) {
        String[] price4500 = {"iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything"};
        String[] price5000 = {"icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte"};

        int total = 0;
        
        for(String item : order) {
            if(Arrays.stream(price4500).anyMatch(menu -> menu.equals(item))) {
                total += 4500;
            } else {
                total += 5000;
            }
        }
        return total;
    }
}