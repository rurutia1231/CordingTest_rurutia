class Solution {
    public int solution(int a, int b, int c) {
        int exponent = 2;
        int exponents = 3;
        int answer = 0;
        if(a==b&b==c){
            answer = (a+b+c)*((int)Math.pow(a,exponent)+(int)Math.pow(b,exponent)+(int)Math.pow(c,exponent))*((int)Math.pow(a,exponents)+(int)Math.pow(b,exponents)+(int)Math.pow(c,exponents));
        }else if(a!=b&a!=c&b!=c){
            answer = a + b + c;
        }else{
        answer = (a+b+c)*((int)Math.pow(a,exponent)+(int)Math.pow(b,exponent)+(int)Math.pow(c,exponent));
        }
        
        return answer;
    }
}