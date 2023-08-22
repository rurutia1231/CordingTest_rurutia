class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String eachOrder : order) {
            if (eachOrder.contains("americano") || eachOrder.equals("anything"))
                answer += 4500;
            else 
                answer += 5000;
        }
        return answer;
    }
}
